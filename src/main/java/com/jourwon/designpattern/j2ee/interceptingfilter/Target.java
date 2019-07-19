package com.jourwon.designpattern.j2ee.interceptingfilter;

/**
 * Description:创建 Target。
 *
 * @author JourWon
 * @date 2019/7/17 18:16
 */
public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }

}
