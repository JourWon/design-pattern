package com.jourwon.designpattern.behavioral.mediator;

/**
 * Description:使用 User 对象来显示他们之间的通信。
 *
 * @author JourWon
 * @date 2019/7/17 14:08
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
