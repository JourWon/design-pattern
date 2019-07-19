package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/13 23:00
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        color = color.toLowerCase();
        switch (color) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                return null;
        }
    }

}
