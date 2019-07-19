package com.jourwon.designpattern.behavioral.interpreter;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 10:43
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }

        return false;
    }

}
