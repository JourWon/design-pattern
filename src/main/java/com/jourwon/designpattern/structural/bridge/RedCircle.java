package com.jourwon.designpattern.structural.bridge;

/**
 * Description:创建实现了 DrawApi 接口的实体桥接实现类。
 *
 * @author JourWon
 * @date 2019/7/15 13:54
 */
public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
