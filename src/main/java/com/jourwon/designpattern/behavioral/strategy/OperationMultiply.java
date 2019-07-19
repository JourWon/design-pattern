package com.jourwon.designpattern.behavioral.strategy;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 15:27
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
