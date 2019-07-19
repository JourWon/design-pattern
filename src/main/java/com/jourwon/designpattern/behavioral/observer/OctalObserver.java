package com.jourwon.designpattern.behavioral.observer;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 14:18
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }

}
