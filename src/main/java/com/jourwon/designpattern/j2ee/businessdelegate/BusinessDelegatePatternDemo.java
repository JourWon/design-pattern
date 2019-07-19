package com.jourwon.designpattern.j2ee.businessdelegate;

/**
 * Description:使用 BusinessDelegate 和 Client 类来演示业务代表模式。
 *
 * @author JourWon
 * @date 2019/7/17 16:49
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();
        System.out.println();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }

}
