package com.jourwon.designpattern.behavioral.interpreter;

/**
 * Description:创建一个表达式接口。
 *
 * @author JourWon
 * @date 2019/7/17 10:42
 */
public interface Expression {

    boolean interpret(String context);

}
