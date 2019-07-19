package com.jourwon.designpattern.creational.prototype;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 10:20
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
