package blatt08.data;

import blatt08.store.DatenhaltungDB;
import blatt08.store.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.zip.DataFormatException;

public class EmployeeContainer extends Observable implements Iterable<Employee> {

    private static EmployeeContainer unique = null;
    private ArrayList<Employee> allEmployees;
    private int count = 0;

    private DatenhaltungDB store = null;

    private EmployeeContainer(String user, String password) throws ClassNotFoundException, SQLException {
		allEmployees = new ArrayList<Employee>();
		connect(user, password);
    }

    public void load() throws SQLException {
		store.load(this);
    }

    private void connect(String user, String password) throws ClassNotFoundException, SQLException {
		store = DatenhaltungDB.instance(user, password);
    }

    public static EmployeeContainer instance(String user, String password) throws ClassNotFoundException,
	    SQLException {
	if (unique == null)
	    unique = new EmployeeContainer(user, password);
	return unique;
    }


    public void linkEmployeeFromDB(Employee a) throws DataFormatException {
	if (this.allEmployees.contains(a))
	    throw new DataFormatException("Angestellter schon vorhanden: "
		    + a.getNumber());
	this.allEmployees.add(a);
	setChanged();
	notifyObservers();
	++count;
    }

    public Iterator<Employee> iterator() {
	return this.allEmployees.iterator();
    }

    public Employee searchEmployee(int number) {
	for (Employee a : allEmployees) {
	    if (a.getNumber() == number)
		return a;
	}
	return null;
    }

    public void close() {
	if (store != null) {
	    store.close();
	}
    }
}
