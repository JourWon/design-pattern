package com.jourwon.designpattern.behavioral.chain;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/16 14:25
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}
