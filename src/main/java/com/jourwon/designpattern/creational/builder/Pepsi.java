package com.jourwon.designpattern.creational.builder;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 9:42
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}
