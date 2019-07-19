package com.jourwon.designpattern.behavioral.memento;

/**
 * Description:创建 Memento 类。
 *
 * @author JourWon
 * @date 2019/7/19 10:07
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}
