package com.jourwon.designpattern.structural.decorator;

/**
 * Description:创建扩展了 ShapeDecorator 类的实体装饰类。
 *
 * @author JourWon
 * @date 2019/7/16 9:31
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color: Red");
    }

}
