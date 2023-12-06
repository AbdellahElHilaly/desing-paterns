package org.code.default_observer;

public class App {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000.0);

        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        laptop.addObserver(person1);
        laptop.addObserver(person2);

        laptop.setPrice(1200.0);

        laptop.deleteObserver(person2);

        laptop.setPrice(1100.0);
    }
}
