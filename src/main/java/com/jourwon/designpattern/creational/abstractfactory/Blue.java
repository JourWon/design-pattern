package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/13 22:54
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fille() method.");
    }

}
