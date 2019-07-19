package com.jourwon.designpattern.behavioral.state;

/**
 * Description:创建 Context 类。
 *
 * @author JourWon
 * @date 2019/7/17 14:49
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
