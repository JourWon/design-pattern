package com.jourwon.designpattern.behavioral.template;

/**
 * Description:使用 Game 的模板方法 play() 来演示游戏的定义方式。
 *
 * @author JourWon
 * @date 2019/7/17 15:59
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }

}
