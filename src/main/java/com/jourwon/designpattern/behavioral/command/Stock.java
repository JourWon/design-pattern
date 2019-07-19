package com.jourwon.designpattern.behavioral.command;

/**
 * Description:创建一个请求类。
 *
 * @author JourWon
 * @date 2019/7/17 9:43
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]sold ");
    }

}
