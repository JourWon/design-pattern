package com.jourwon.designpattern.creational.builder;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 9:42
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }

}
