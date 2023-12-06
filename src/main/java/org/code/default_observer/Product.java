package org.code.default_observer;

import java.util.Observable;

// Subject: Product class
class Product extends Observable {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

        // Notify observers about the price change
        setChanged();
        notifyObservers();
    }
}