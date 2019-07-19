package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/13 22:55
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fille() method.");
    }

}
