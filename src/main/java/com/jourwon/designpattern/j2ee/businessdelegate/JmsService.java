package com.jourwon.designpattern.j2ee.businessdelegate;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 16:43
 */
public class JmsService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
