package com.jourwon.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:创建一个工厂，生成基于给定信息的实体类的对象。
 *
 * @author JourWon
 * @date 2019/7/16 11:29
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }


}
