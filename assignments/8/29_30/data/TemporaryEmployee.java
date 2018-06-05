package blatt08.data;

import blatt08.store.Employee;

import java.time.LocalDate;
import java.util.zip.DataFormatException;

public class TemporaryEmployee extends Employee {

    private LocalDate endOfContract;

    public TemporaryEmployee(int number, String name, LocalDate beginOfContract,
                             LocalDate endOfContract) throws DataFormatException {
	super(number, name, beginOfContract);
	setEndOfContract(endOfContract);
    }

    private boolean checkEndOfContract(LocalDate endOfContract) {
	return this.getBeginOfContract().isBefore(endOfContract);
    }

    private void setEndOfContract(LocalDate endOfContract)
	    throws DataFormatException {
	if (!checkEndOfContract(endOfContract))
	    throw new DataFormatException(
		    "Objekt Zeitangestellter: Ungueltiges Vertragsende");
	this.endOfContract = endOfContract;
    }

    public LocalDate getEndOfContract() {
	return endOfContract;
    }

    @Override
    public String toString() {
	return super.toString() + ", bis " + getEndOfContract();
    }

}
