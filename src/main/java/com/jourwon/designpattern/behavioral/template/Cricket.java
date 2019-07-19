package com.jourwon.designpattern.behavioral.template;

/**
 * Description:创建扩展了上述类的实体类。
 *
 * @author JourWon
 * @date 2019/7/17 15:58
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
