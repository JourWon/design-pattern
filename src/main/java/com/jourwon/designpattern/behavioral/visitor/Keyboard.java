package com.jourwon.designpattern.behavioral.visitor;

/**
 * Description:创建扩展了 ComputerPart 的实体类。
 *
 * @author JourWon
 * @date 2019/7/17 16:06
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
