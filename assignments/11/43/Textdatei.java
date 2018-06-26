package aufgabe43;

import java.io.*;
import java.util.Iterator;

public class Textdatei {

	private BufferedReader reader;
	private PrintWriter writer;
	private String filename;

	public Textdatei(String filename) throws PersistenceException {
		if (filename == null) throw new PersistenceException("Filename is null", null);
		this.filename = filename;
	}

	public void load(BuchContainer con) throws PersistenceException {
		try {
			reader = new BufferedReader(new FileReader(this.filename));
			String isbn, titel, line = reader.readLine();
			
			while (!line.equals("end")) {
				if (!line.equals("new")) {
					reader.close();
					throw new PersistenceException("Invalid format!", null);
				}
				try {
					isbn = reader.readLine();
					titel = reader.readLine();
					if (titel == null) {
						// muss nicht werfen, macht aber sinn, da Datei anscheinend beschädigt.
						throw new PersistenceException("Invalid end-of-input", null);
					}
					con.linkBuch(new Buch(isbn, titel));
				} catch(IOException e) {
					throw new PersistenceException("Error while reading book store!", e);
				}
				line = reader.readLine();
			}
		} catch(IOException e) {
			throw new PersistenceException("Error while opening book store", e);
		} finally {
			try { reader.close(); } catch(Exception ee) {}
		}
	}
	
	public void save(BuchContainer con) throws PersistenceException {
		try {
			writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(filename))));
			for (Buch b: con) {
				writer.println("new");
				writer.println(b.getISBN());
				writer.println(b.getTitel());
			}
			writer.println("end");
		} catch (IOException e) {
			throw new PersistenceException("Error while writing to book store!", e);
		} finally {
			writer.close(); 
		}
	}

}