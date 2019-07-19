package com.jourwon.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:创建 CareTaker 类。
 *
 * @author JourWon
 * @date 2019/7/19 10:08
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
