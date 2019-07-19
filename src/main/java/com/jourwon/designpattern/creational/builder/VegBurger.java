package com.jourwon.designpattern.creational.builder;

/**
 * Description:创建扩展了 Burger 和 ColdDrink 的实体类。
 *
 * @author JourWon
 * @date 2019/7/15 9:40
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
