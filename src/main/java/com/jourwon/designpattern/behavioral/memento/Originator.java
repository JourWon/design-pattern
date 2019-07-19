package com.jourwon.designpattern.behavioral.memento;

/**
 * Description:创建 Originator 类。
 *
 * @author JourWon
 * @date 2019/7/19 10:07
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }

}
