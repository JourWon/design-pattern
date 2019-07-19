package com.jourwon.designpattern.behavioral.command;

/**
 * Description:创建实现了 Order 接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/17 9:47
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }


    @Override
    public void execute() {
        abcStock.buy();
    }
}
