package com.jourwon.designpattern.structural.adapter;

/**
 * Description:为媒体播放器和更高级的媒体播放器创建接口。
 *
 * @author JourWon
 * @date 2019/7/15 10:57
 */
public interface MediaPlayer {

    void play(String audioType, String fileName);

}
