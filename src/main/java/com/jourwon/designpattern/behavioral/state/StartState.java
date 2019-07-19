package com.jourwon.designpattern.behavioral.state;

/**
 * Description:创建实现接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/17 14:50
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }

}
