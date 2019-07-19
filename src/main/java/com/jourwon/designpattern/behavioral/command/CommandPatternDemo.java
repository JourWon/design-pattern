package com.jourwon.designpattern.behavioral.command;

/**
 * Description:使用 Broker 类来接受并执行命令。
 *
 * @author JourWon
 * @date 2019/7/17 10:28
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }

}
