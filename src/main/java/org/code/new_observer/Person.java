package org.code.new_observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Person implements PropertyChangeListener {
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("price".equals(evt.getPropertyName())) {
            System.out.println(personName + " received a notification: " +
                    "The price has changed to $" + evt.getNewValue());
        }
    }
}
