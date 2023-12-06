package org.code.observer.store;

import org.code.observer.notification.Observer;

public class Person implements Observer {
    private String  name;

    public Person(String name) {
        this.name = name;
    }


    @Override
    public void update(String message) {
        System.out.println("new notification for " + name + "   :  " + message);
    }


}
