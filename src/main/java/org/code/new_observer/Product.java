package org.code.new_observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class Product {
    private String productName;
    private double price;
    private PropertyChangeSupport propertyChangeSupport;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double oldPrice = this.price;
        this.price = price;

        propertyChangeSupport.firePropertyChange("price", oldPrice, price);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}