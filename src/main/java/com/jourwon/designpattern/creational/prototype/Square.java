package com.jourwon.designpattern.creational.prototype;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 10:19
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
