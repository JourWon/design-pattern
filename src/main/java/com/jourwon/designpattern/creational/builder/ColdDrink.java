package com.jourwon.designpattern.creational.builder;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 9:38
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
