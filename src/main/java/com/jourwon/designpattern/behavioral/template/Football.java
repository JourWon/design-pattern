package com.jourwon.designpattern.behavioral.template;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 15:59
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

}
