package com.jourwon.designpattern.structural.flyweight;

/**
 * Description:创建实现接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/16 11:22
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y : " + y + ", radius : " + radius);
    }

}
