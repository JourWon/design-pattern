package com.jourwon.designpattern.behavioral.strategy;

/**
 * Description:创建 Context 类。
 *
 * @author JourWon
 * @date 2019/7/17 15:28
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
