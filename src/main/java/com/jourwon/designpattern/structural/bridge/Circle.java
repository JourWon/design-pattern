package com.jourwon.designpattern.structural.bridge;

/**
 * Description:创建实现了 Shape 接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/15 13:57
 */
public class Circle extends Shape {

    int x, y, radius;

    protected Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }

}
