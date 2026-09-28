
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Discountable {

    /**
     * @param percent 
     * @return
     */
    public void applyDiscount(double percent);

    /**
     * @return
     */
    public double calculateFinalPrice();

}