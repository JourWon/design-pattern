package com.jourwon.designpattern.creational.factory;

/**
 * Description:创建实现接口的正方形实体类
 *
 * @author JourWon
 * @date 2019/7/12 15:34
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
