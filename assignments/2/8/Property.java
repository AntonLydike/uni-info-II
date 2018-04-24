package aufgabe8;

import java.util.zip.DataFormatException;

public class Property {
	private double price;
	private int size;

	private static double fee = 3.45;
	
	public Property (double price, int size) throws DataFormatException {
		setPrice(price);
		setSize(size);
	}
	
	public void setPrice(double price) throws DataFormatException {
		if (!checkPrice(price)) {
			throw new DataFormatException("Invalid Price");
		}
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	private boolean checkPrice(double price) {
		return price > 0;
	}
	
	public void setSize(int size) throws DataFormatException {
		if (!checkSize(size)) {
			throw new DataFormatException("Invalid size");
		}
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}
	
	private boolean checkSize(int size) {
		return size > 0;
	}
	
	public static double getFee () {
		return Property.fee;
	}	
}
