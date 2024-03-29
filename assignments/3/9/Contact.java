package aufgabe9;
/*
 * 
 * @Contact.java 03 24.04.2018 (Robert Lorenz)
 * 
 * Copyright (c) 2017 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

import java.util.ArrayList; /*Klasse ArrayList importieren*/
import java.util.zip.DataFormatException;

/**
 * Kontakte mit Namen (erforderlich), Geburtstag (optional) und Telefonliste
 * (optional)
 * 
 * @author lorenzro
 */
public class Contact {

	private String birthday;
	private String name;
	private ArrayList<String> telephone;

	/**
	 * Erzeugt einen neuen Kontakt mit dem übergebenen Namen
	 * 
	 * @param name
	 *            der Name des erzeugten Kontakts
	 *            
	 * @throws DataFormatException falls ungültige Daten übergeben wurden
	 */
	public Contact(String name) throws DataFormatException {
		setName(name);
		birthday = null; /* Standardwert setzen */
		telephone = new ArrayList<String>(); /* Leere Liste erzeugen */
	}

	/**
	 * Gibt den Geburtstag zurück
	 * 
	 * @return Geburtstag des Kontakts
	 */
	public String getBirthday() {
		return this.birthday;
	}

	private static boolean checkBirthday(String birthday) {
	    /* Ueberpruefung mit regulaeren Ausdruecken */
	    return birthday.matches("\\d{2}\\.\\d{2}\\.\\d{4}"); 
	}

	/**
	 * Setzt den Geburtstag neu, falls ein gültiger Wert in der Form tt.mm.yyyy
	 * # mit tt=Tag zweistellig, mm=Monat zweistellig und yyyy=Jahr vierstellig
	 * übergeben wird
	 * 
	 * @param birthday
	 *            der neue Geburtstag
	 *            
	 * @throws DataFormatException falls ungültige Daten übergeben wurden
	 */
	public void setBirthday(String birthday) throws DataFormatException {
		if (birthday != null && !checkBirthday(birthday))
			throw new DataFormatException("Objekt Contact: Geburtstag ungueltig");
		this.birthday = birthday;
	}

	/**
	 * Gibt den Namen zurück
	 * 
	 * @return Name des Kontakts
	 */
	public String getName() {
		return name;
	}

	private static boolean checkName(String name) {
		return (name != null && name.length() > 0);
	}

	/**
	 * Setzt den Namen neu, falls ein gültiger Wert mit mindestens Länge 1
	 * übergeben wird
	 * 
	 * @param name
	 *            der neue Name
	 *            
	 * @throws IllegalArgumentException falls ungültige Daten übergeben wurden
	 */
	public void setName(String name) throws DataFormatException {
		if (!checkName(name))
			throw new DataFormatException("Objekt Contact: Name ungueltig");
		this.name = name;
	}

	/**
	 * Gibt die Telefonliste zurück
	 * 
	 * @return Name des Kontakts
	 */
	public ArrayList<String> getTelephone() {
		/* Kopie erzeugen und zurückgeben */
		ArrayList<String> copy = new ArrayList<String>();
		for (String number : this.telephone) {/* Telefonliste durchlaufen */
			copy.add(number);
		}
		return copy;
	}

	/* Alternative zur Rückgabe der Liste aller Telefonnummern*/
	/**
	 * Gibt die p-te Nummer aus der Telefonliste zurück
	 * 
	 * @param p
	 *            Index der geforderten Nummer aus der Telefonliste
	 * @return p-te Nummer der Telefonlsite, falls Wert vorhanden
	 * 
	 * @throws IndexOutOfBoundsException falls p-ter Wert nicht vorhanden
	 */
	public String getTelephone(int p) throws IndexOutOfBoundsException {
	    return this.telephone.get(p);
	}

	/* Alternative zur Rückgabe der Liste aller Telefonnummern*/
	/**
	 * Gibt die Anzahl aller Nummern aus der Telefonliste zurück
	 * 
	 * @return Anzahl aller Nummern aus der Telefonliste
	 * 
	 */
	public int getCountTelephone() {
	    return this.telephone.size();
	}

	private static boolean checkTelephone(String telephone) {
		return true;
	}

	/**
	 * Fügt eine neue Telefonnummer hinzu
	 * 
	 * @throws DataFormatException falls ungültige Daten übergeben wurden
	 */
	public void addTelephone(String telephone) throws DataFormatException {
		if (!checkTelephone(telephone))
			throw new DataFormatException("Objekt Contact: Telefon ungueltig");
		if (this.telephone.contains(telephone)) {
			throw new DataFormatException("Objekt Contact: Telefon schon vorhanden");
		}
		this.telephone.add(telephone);
	}

	/**
	 * Löscht eine Telefonnummer
	 * 
	 */
	public void deleteTelephone(String telephone) {
		this.telephone.remove(telephone);
	}
}
