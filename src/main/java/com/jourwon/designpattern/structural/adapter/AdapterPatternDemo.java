package com.jourwon.designpattern.structural.adapter;

/**
 * Description:使用 AudioPlayer 来播放不同类型的音频格式。
 *
 * @author JourWon
 * @date 2019/7/15 11:13
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
