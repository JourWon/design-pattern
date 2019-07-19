package com.jourwon.designpattern.structural.decorator;

/**
 * Description:使用 RedShapeDecorator 来装饰 Shape 对象。
 *
 * @author JourWon
 * @date 2019/7/16 9:33
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }

}
