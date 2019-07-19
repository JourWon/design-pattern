package com.jourwon.designpattern.structural.bridge;

/**
 * Description:使用 Shape 和 DrawApi 类画出不同颜色的圆。
 *
 * @author JourWon
 * @date 2019/7/15 16:39
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }


}
