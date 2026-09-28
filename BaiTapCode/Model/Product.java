
import java.io.*;
import java.util.*;

public abstract class Product {
    private String id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public String getId() {
        // TODO implement here
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        // TODO implement here
        return this.name;
    }

    public void setName(String newName) {
        // TODO implement here
        this.name = newName;
    }

    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    public void setPrice(double newPrice) {
        // TODO implement here
        this.price = newPrice;
    }

}