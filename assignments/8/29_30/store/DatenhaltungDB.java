package blatt08.store;


import blatt08.data.EmployeeContainer;
import blatt08.data.TemporaryEmployee;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public class DatenhaltungDB {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://educos-srv01.informatik.uni-augsburg.de:3306/theDatabase?useSSL=false";
    // private static final String user = "student";
    //  private static final String password = "inFormatik2";
    private Connection con = null;
    private static DatenhaltungDB unique = null;
    final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /*
     * Verbindung mit Datenbank herstellen
     */
    private DatenhaltungDB(String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, password);
    }

    /*
     * Zugriff auf Singleton-Objekt
     */
    public static DatenhaltungDB instance(String user, String password) throws ClassNotFoundException,
            SQLException {
        if (unique == null)
            unique = new DatenhaltungDB(user, password);
        return unique;
    }

    /*
     * Alle Angestelltendaten aus Tabelle laden
     */
    public void load(EmployeeContainer container) throws SQLException {
        Employee a = null;
        Statement abfrage = null;
        ResultSet employees = null;
        if (con == null)
            return;
        abfrage = con.createStatement();

        //SQL-Befehl erstellen und abschicken
        String befehl1 = "select * from Angestellter";
        employees = abfrage.executeQuery(befehl1);

        //Ergebnistabelle durchlaufen
        while (employees.next()) {
            try {
                //Fallunterscheidung, ob Zeitangestellter oder nicht
                if (employees.getBoolean(5) == false) {
                    LocalDate beginDate = LocalDate.parse(employees
                            .getString(3), DATE_FORMAT);
                    //Angestellten-Objekt erstellen
                    a = new Employee(employees.getInt(1),
                            employees.getString(2), beginDate);
                } else {
                    if (employees.getBoolean(5) == true) {
                        LocalDate beginDate = LocalDate.parse(employees
                                .getString(3), DATE_FORMAT);
                        LocalDate endDate = LocalDate.parse(employees
                                .getString(4), DATE_FORMAT);
                        //Zeitangestellten-Objekt erstellen
                        a = new TemporaryEmployee(employees.getInt(1),
                                employees.getString(2), beginDate, endDate);
                    }
                }
                //Erstelltes Objekt in Container aufnehmen
                container.linkEmployeeFromDB(a);
            } catch (DateTimeParseException e) {
                System.out.println("Angestellter " + employees.getInt(1)
                        + " kann nicht geladen werden: " + e.getMessage());
            } catch (DataFormatException e) {
                System.out.println("Angestellter " + employees.getInt(1)
                        + " kann nicht geladen werden: " + e.getMessage());
            }
        }
        abfrage.close();
    }

    /*
     * Verbindung schließen
     */
    public void close() {
        try {
            if (con != null)
                con.close();
        } catch (SQLException e) {
            System.out.println("Datenbankfehler beim Schließen");
        }
    }
}
