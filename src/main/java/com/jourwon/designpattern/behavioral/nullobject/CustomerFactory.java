package com.jourwon.designpattern.behavioral.nullobject;

/**
 * Description:创建 CustomerFactory 类。
 *
 * @author JourWon
 * @date 2019/7/17 15:15
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
