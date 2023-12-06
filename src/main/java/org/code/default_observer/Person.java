package org.code.default_observer;

import java.util.Observable;
import java.util.Observer;
// Observer: Person class
class Person implements Observer {
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Product) {
            Product product = (Product) o;
            System.out.println(personName + " received a notification: " +
                    "The price of " + product.getProductName() + " has changed to $" + product.getPrice());
        }
    }
}