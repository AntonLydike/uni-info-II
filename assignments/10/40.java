package aufgabe40;

import java.sql.*;

public class Datenbank {
	private final int DBOP_DELETE = 1;
	private final int DBOP_INSERT = 0;
	private Connection con;
	
	public void add(Buch b) throws LoadSaveException {	
		dbop(b, DBOP_INSERT);
	}
	
	public void delete (Buch b) throws LoadSaveException {
		dbop(b, DBOP_DELETE);
	}
	
	private void dbop(Buch b, int op) throws LoadSaveException {
		PreparedStatement s;
		try {
			con = this.connect();
			switch (op) {
			case DBOP_DELETE:
				s = con.prepareStatement("REMOVE FROM buch WHERE isbn = ?");
				s.setString(1, b.getISBN());
				break;
			case DBOP_INSERT:
				s = con.prepareStatement("INSERT INTO buch (`isbn`, `title`) VALUES (?, ?)");
				s.setString(1, b.getISBN());
				s.setString(2, b.getTitel());
				break;
			default:
				throw new LoadSaveException("What?", new WhatTheFuckJustHappenedException());
			}
			s.executeUpdate();			
		} catch (SQLException e) {
			throw new LoadSaveException("It worked on my machine", e);
		}

		try {
			if (s != null) s.close();
		} catch(Exception e) {}
		
		try {
			if (con != null) con.close();
		} catch(Exception e) {}
	}
	
	// stub
	private Connection connect() {return null;}
}

// more stubs
class Buch {
	public String getTitel() {return "JavaScript: The Definitive Guide";} 
	public String getISBN() {return "9781495333347";}
}
// damn, thats a lot of stubs
class LoadSaveException extends Exception {
	public LoadSaveException (String msg, Throwable t) {super(msg, t);}
}
// quite *stub*born... hehe
class WhatTheFuckJustHappenedException extends Exception {}