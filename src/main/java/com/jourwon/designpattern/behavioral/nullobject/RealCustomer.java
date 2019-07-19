package com.jourwon.designpattern.behavioral.nullobject;

/**
 * Description:创建扩展了 AbstractCustomer 的实体类。
 *
 * @author JourWon
 * @date 2019/7/17 15:13
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

}
