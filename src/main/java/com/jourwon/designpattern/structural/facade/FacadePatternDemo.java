package com.jourwon.designpattern.structural.facade;

/**
 * Description:使用该外观类画出各种类型的形状。
 *
 * @author JourWon
 * @date 2019/7/16 10:07
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
