package com.jourwon.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:创建命令调用类。
 *
 * @author JourWon
 * @date 2019/7/17 10:20
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
