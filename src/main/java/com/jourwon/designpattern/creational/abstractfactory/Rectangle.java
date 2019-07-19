package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:创建实现接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/13 22:51
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
