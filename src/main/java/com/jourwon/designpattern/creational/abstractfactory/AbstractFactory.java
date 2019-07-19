package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:为 Color 和 Shape 对象创建抽象类来获取工厂。
 *
 * @author JourWon
 * @date 2019/7/13 22:56
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shape);

    abstract Color getColor(String color);

}
