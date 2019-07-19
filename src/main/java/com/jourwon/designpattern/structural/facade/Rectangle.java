package com.jourwon.designpattern.structural.facade;

/**
 * Description:创建实现接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/16 10:03
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

}
