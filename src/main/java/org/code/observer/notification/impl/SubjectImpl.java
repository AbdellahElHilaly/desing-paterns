package org.code.observer.notification.impl;

import org.code.observer.notification.Observer;
import org.code.observer.notification.Subject;

import java.util.ArrayList;
import java.util.List;

public  class SubjectImpl implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observerList.forEach(observer -> observer.update(message));
    }

}
