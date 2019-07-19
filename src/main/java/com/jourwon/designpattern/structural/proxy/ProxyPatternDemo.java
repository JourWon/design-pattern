package com.jourwon.designpattern.structural.proxy;

/**
 * Description:当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 *
 * @author JourWon
 * @date 2019/7/16 14:05
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");

        //图像将从磁盘加载
        image.display();
        System.out.println("");

        //图像将无法从磁盘加载
        image.display();
    }

}
