
import java.io.*;
import java.util.*;

/**
 * 
 */
public class ElectronicProduct extends {abstract} Product implements Discountable, Discountable {

    /**
     * Default constructor
     */
    public ElectronicProduct() {
    }

    /**
     * 
     */
    public int warrantyMonths;

    /**
     * @return
     */
    public void calculateFinalPrice() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract double calculateFinalPrice();

    /**
     * @param percent 
     * @return
     */
    public void applyDiscount(double percent) {
        // TODO implement Discountable.applyDiscount() here
        return null;
    }

    /**
     * @return
     */
    public double calculateFinalPrice() {
        // TODO implement Discountable.calculateFinalPrice() here
        return 0.0d;
    }

}