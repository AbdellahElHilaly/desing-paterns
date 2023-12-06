package org.code.new_observer;

public class App {

    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000.0);

        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        laptop.addPropertyChangeListener(person1);
        laptop.addPropertyChangeListener(person2);

        laptop.setPrice(1200.0);

        laptop.removePropertyChangeListener(person2);

        laptop.setPrice(1100.0);
    }


}
