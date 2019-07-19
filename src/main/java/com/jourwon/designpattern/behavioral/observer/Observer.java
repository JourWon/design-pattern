package com.jourwon.designpattern.behavioral.observer;

/**
 * Description:创建 Observer 类。
 *
 * @author JourWon
 * @date 2019/7/17 14:14
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
