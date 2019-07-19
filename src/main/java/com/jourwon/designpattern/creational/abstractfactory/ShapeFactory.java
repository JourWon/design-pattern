package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:创建扩展了 CustomerFactory 的工厂类，基于给定的信息生成实体类的对象。
 *
 * @author JourWon
 * @date 2019/7/13 22:58
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        shape = shape.toLowerCase();

        switch (shape) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }

    }

    @Override
    Color getColor(String color) {
        return null;
    }

}
