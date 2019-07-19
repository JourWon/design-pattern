package com.jourwon.designpattern.j2ee.servicelocator;

/**
 * Description:为 JNDI 查询创建 InitialContext。
 *
 * @author JourWon
 * @date 2019/7/17 18:21
 */
public class InitialContext {

    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }

}
