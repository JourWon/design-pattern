package com.jourwon.designpattern.structural.adapter;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 11:00
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
