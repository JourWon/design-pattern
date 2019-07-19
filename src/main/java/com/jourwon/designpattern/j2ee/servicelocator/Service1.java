package com.jourwon.designpattern.j2ee.servicelocator;

/**
 * Description:创建实体服务。
 *
 * @author JourWon
 * @date 2019/7/17 18:20
 */
public class Service1 implements Service {

    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }

}
