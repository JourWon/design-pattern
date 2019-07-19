package com.jourwon.designpattern.creational.factory;

/**
 * Description:创建一个工厂，生成基于给定信息的实体类的对象。
 *
 * @author JourWon
 * @date 2019/7/12 15:37
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        shapeType = shapeType.toLowerCase();

        switch (shapeType) {
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

}
