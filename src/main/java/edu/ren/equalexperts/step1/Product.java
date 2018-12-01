package edu.ren.equalexperts.step1;

/**
 * Created by rrn3194 on 11/27/18.
 */
public class Product {
    Integer id;
    double price;
    String name;

    public Product(Integer id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
