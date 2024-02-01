package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> purchasedProducts;

    public Basket() {
        purchasedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void removeProduct(Product product) {
        purchasedProducts.remove(product);
    }

    public void printBasket() {
        for (Product product : purchasedProducts) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
        }
    }
}