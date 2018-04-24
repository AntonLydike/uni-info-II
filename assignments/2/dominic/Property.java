package blatt02;

import java.util.zip.DataFormatException;

public class Property {

    private double price;
    private int livingSpace;
    private final static double FEE = 3.45;

    public Property(double price, int livingSpace) throws DataFormatException{
        this.setPrice(price);
        this.setLivingSpace(livingSpace);
    }


    public static double getFee() {
        return Property.FEE;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws DataFormatException{
        if (!checkPrice(price)) {
            throw new DataFormatException("Price can not be negative");
        }
        this.price = price;
    }

    public int getLivingSpace() {
        return livingSpace;
    }

    public void setLivingSpace(int livingSpace) throws DataFormatException{
        if (!checkLivingSpace(livingSpace)) {
            throw new DataFormatException("Living space can not be negative");
        }
        this.livingSpace = livingSpace;
    }

    private boolean checkLivingSpace(int livingSpace) {
        return livingSpace > 0;
    }

    private boolean checkPrice(double price) {
        return price > 0;
    }
}
