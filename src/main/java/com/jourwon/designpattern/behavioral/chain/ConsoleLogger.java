package com.jourwon.designpattern.behavioral.chain;

/**
 * Description:创建扩展了该记录器类的实体类。
 *
 * @author JourWon
 * @date 2019/7/16 14:22
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}
