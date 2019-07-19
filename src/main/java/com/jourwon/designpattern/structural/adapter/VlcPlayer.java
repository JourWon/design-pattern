package com.jourwon.designpattern.structural.adapter;

/**
 * Description:创建实现了 AdvancedMediaPlayer 接口的实体类。
 *
 * @author JourWon
 * @date 2019/7/15 10:59
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }

}
