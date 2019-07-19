package com.jourwon.designpattern.creational.builder;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 9:41
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }

}
