package com.jourwon.designpattern.creational.builder;

/**
 * Description:创建实现 Packing 接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/15 9:22
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }

}
