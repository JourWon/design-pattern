package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/13 22:53
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fille() method.");
    }

}
