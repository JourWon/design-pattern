package com.jourwon.designpattern.creational.factory;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/12 15:36
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
