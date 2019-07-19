package com.jourwon.designpattern.structural.proxy;

/**
 * Description:创建实现接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/16 13:45
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

}
