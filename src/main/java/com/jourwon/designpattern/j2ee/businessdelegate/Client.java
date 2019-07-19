package com.jourwon.designpattern.j2ee.businessdelegate;

/**
 * Description:创建客户端。
 *
 * @author JourWon
 * @date 2019/7/17 16:48
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }

}
