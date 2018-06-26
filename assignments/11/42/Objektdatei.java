package aufgabe42;

import java.io.*;
import java.util.Iterator;

import aufgabe43.*;

public class Objektdatei {

	public String filename;
	
	public Objektdatei(String filename) throws PersistenceException {
		if (filename == null) 
			throw new PersistenceException("Filename shan't be null! (But this excpetions cause shall be)", null);
		this.filename = filename;
	}
	
	public void load (ArtikelContainer con) throws PersistenceException {
		ArtikelContainer tmp;
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename))) {
			tmp = (ArtikelContainer) reader.readObject();
			for (Artikel a: tmp) {
				con.linkArtiel(a);
			}
		} catch (IOException | ClassNotFoundException ex) {
			throw new PersistenceException("Reading failed", ex);
		}
	}

	public void save (ArtikelContainer con) throws PersistenceException {
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filename))) {
			writer.writeObject(con);
	    } catch (IOException ex) {
			throw new PersistenceException("Saving failed", ex);
	    }
	}
}