package com.jourwon.designpattern.structural.bridge;

/**
 * Description:使用 DrawApi 接口创建抽象类 Shape。
 *
 * @author JourWon
 * @date 2019/7/15 13:56
 */
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();

}
