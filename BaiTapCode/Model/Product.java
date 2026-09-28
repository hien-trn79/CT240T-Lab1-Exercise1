
import java.io.*;
import java.util.*;

public abstract class Product {
    private string id;
    private string name;
    private double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public string getId() {
        // TODO implement here
        return null;
    }

    public void setId(string id) {
        // TODO implement here
        return null;
    }

    public string getName() {
        // TODO implement here
        return null;
    }

    public void setName(string newName) {
        // TODO implement here
        return null;
    }

    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    public void setPrice(double newPrice) {
        // TODO implement here
        return null;
    }

}