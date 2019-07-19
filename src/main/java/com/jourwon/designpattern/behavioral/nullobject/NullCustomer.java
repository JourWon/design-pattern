package com.jourwon.designpattern.behavioral.nullobject;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 15:15
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
