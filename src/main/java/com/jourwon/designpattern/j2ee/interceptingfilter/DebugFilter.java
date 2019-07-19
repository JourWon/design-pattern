package com.jourwon.designpattern.j2ee.interceptingfilter;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 18:13
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request){
        System.out.println("request log: " + request);
    }

}
