package com.jourwon.designpattern.creational.builder;

/**
 * Description:创建一个表示食物条目和食物包装的接口。
 *
 * @author JourWon
 * @date 2019/7/15 9:20
 */
public interface Item {

    String name();

    Packing packing();

    float price();

}
