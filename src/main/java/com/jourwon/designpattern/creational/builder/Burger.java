package com.jourwon.designpattern.creational.builder;

/**
 * Description:创建实现 Item 接口的抽象类，该类提供了默认的功能。
 *
 * @author JourWon
 * @date 2019/7/15 9:37
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
