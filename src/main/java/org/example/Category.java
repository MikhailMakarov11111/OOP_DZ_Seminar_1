package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name, Product... products) {
        this.name = name;
        this.products = new ArrayList<>(Arrays.asList(products));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
