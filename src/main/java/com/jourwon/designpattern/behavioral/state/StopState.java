package com.jourwon.designpattern.behavioral.state;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 14:52
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }

}
