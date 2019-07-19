package com.jourwon.designpattern.creational.prototype;

/**
 * Description:创建扩展了上面抽象类的实体类。
 *
 * @author JourWon
 * @date 2019/7/15 10:19
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
