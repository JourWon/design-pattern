package com.jourwon.designpattern.behavioral.state;

/**
 * Description:使用 Context 来查看当状态 State 改变时的行为变化。
 *
 * @author JourWon
 * @date 2019/7/17 15:06
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());
        System.out.println();

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
