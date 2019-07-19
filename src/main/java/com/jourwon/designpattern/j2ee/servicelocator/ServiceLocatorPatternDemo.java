package com.jourwon.designpattern.j2ee.servicelocator;

/**
 * Description:使用 ServiceLocator 来演示服务定位器设计模式。
 *
 * @author JourWon
 * @date 2019/7/17 18:23
 */
public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        System.out.println();

        service = ServiceLocator.getService("Service2");
        service.execute();
        System.out.println();

        service = ServiceLocator.getService("Service1");
        service.execute();

        System.out.println();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }

}
