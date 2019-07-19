package com.jourwon.designpattern.structural.decorator;

/**
 * Description:创建实现了 Shape 接口的抽象装饰类。
 *
 * @author JourWon
 * @date 2019/7/16 9:29
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
