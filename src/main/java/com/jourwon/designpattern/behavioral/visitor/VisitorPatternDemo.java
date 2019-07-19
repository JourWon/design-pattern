package com.jourwon.designpattern.behavioral.visitor;

/**
 * Description:使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。
 *
 * @author JourWon
 * @date 2019/7/17 16:15
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
