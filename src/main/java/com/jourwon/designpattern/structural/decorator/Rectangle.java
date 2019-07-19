package com.jourwon.designpattern.structural.decorator;

/**
 * Description:创建实现接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/16 9:28
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

}
