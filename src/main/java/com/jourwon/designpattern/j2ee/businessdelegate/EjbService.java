package com.jourwon.designpattern.j2ee.businessdelegate;

/**
 * Description:创建实体服务类。
 *
 * @author JourWon
 * @date 2019/7/17 16:42
 */
public class EjbService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
