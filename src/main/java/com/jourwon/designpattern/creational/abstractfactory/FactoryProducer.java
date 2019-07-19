package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 *
 * @author JourWon
 * @date 2019/7/13 23:05
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }

        if ("shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else {
            return null;
        }

    }

}
