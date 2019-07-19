package com.jourwon.designpattern.behavioral.observer;

/**
 * Description:使用 Subject 和实体观察者对象。
 *
 * @author JourWon
 * @date 2019/7/17 14:19
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println();

        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
