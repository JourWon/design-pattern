package com.jourwon.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:创建 Subject 类。
 *
 * @author JourWon
 * @date 2019/7/17 14:13
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
