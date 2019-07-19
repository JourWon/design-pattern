package com.jourwon.designpattern.structural.bridge;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 13:55
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
