package com.jourwon.designpattern.j2ee.compositeentity;

/**
 * Description:使用 Client 来演示组合实体设计模式的用法。
 *
 * @author JourWon
 * @date 2019/7/17 17:30
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        System.out.println();

        client.setData("Second Test", "Data1");
        client.printData();
    }

}
