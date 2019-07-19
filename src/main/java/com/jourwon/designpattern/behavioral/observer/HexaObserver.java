package com.jourwon.designpattern.behavioral.observer;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 14:19
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

}
