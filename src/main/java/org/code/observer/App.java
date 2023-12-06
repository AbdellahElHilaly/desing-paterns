package org.code.observer;

import org.code.observer.store.Person;
import org.code.observer.store.Product;

public class App {


    public static void main(String[] args) {


        Product product = new Product("Laptop");


        Person person1 = new Person("AbdelKader");
        Person person2 = new Person("Jilali");
        Person person3 = new Person("Laarbi");



        product.attach(person1);
        product.attach(person2);
        product.attach(person3);


        product.detach(person2);



        product.setAvailability(true);

    }


}
