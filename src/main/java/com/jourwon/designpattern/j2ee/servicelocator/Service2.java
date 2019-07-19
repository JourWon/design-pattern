package com.jourwon.designpattern.j2ee.servicelocator;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 18:20
 */
public class Service2 implements Service {

    @Override
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
