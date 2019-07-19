package com.jourwon.designpattern.creational.factory;

/**
 * Description:创建实现接口的长方形实体类
 *
 * @author JourWon
 * @date 2019/7/12 15:27
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
