package com.jourwon.designpattern.behavioral.command;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 9:48
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}
