package com.jourwon.designpattern.behavioral.chain;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/16 14:26
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }

}
