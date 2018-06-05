package blatt08.store;

import java.time.LocalDate;
import java.util.zip.DataFormatException;

public class Employee {

    private int number;
    private String name;
    private LocalDate beginOfContract;

    public Employee(int number, String name, LocalDate beginOfContract)
	    throws DataFormatException {
	setNumber(number);
	setName(name);
	setBeginOfContract(beginOfContract);
    }

    private static boolean checkNumber(int number) {
	return true;
    }

    public void setNumber(int number) throws DataFormatException {
	if (!checkNumber(number))
	    throw new DataFormatException("Nummer muss größer als 0 sein: "
		    + number);
	this.number = number;
    }

    public int getNumber() {
	return number;
    }

    private static boolean checkName(String name) {
		return true;
    }

    public void setName(String name) throws DataFormatException {
	if (!checkName(name))
	    throw new DataFormatException(
		    "Objekt Angestellter: Ungueltiger Name");
	this.name = name;
    }

    private static boolean checkBeginOfContract(LocalDate beginOfContract) {
	return true;
    }

    private void setBeginOfContract(LocalDate beginOfContract)
	    throws DataFormatException {
	if (!checkBeginOfContract(beginOfContract))
	    throw new DataFormatException(
		    "Objekt Angestellter: Ungueltiger Vertragsbeginn");
	this.beginOfContract = beginOfContract;
    }

    public String getName() {
	return name;
    }

    public LocalDate getBeginOfContract() {
	return beginOfContract;
    }

    @Override
    public boolean equals(Object o) {
	if (o == null)
	    return false;
	if (!(o instanceof Employee))
	    return false;
	Employee a = (Employee) o;
	return (a.getNumber() == this.getNumber());
    }

    @Override
    public String toString() {
	return "Angestellter " + getNumber() + ": " + getName() + ", ab "
		+ getBeginOfContract();
    }
}
