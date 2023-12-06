package org.code.observer.store;

import org.code.observer.notification.impl.SubjectImpl;

public class Product  extends SubjectImpl {
    private String name;
    private String availability;
    public Product(String name) {
        this.name = name;
    }


    public void setAvailability(Boolean availability) {

        this.availability = availability ? "available" : "not available";

        notifyObservers("Product " + name + " is now " + this.availability);

    }






}
