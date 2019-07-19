package com.jourwon.designpattern.behavioral.observer;

/**
 * Description:创建实体观察者类。
 *
 * @author JourWon
 * @date 2019/7/17 14:17
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }

}
