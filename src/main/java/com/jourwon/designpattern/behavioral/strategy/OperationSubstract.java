package com.jourwon.designpattern.behavioral.strategy;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 15:26
 */
public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}
