package com.jourwon.designpattern.structural.proxy;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/16 14:02
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
