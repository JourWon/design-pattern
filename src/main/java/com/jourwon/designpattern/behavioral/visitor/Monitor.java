package com.jourwon.designpattern.behavioral.visitor;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 16:07
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
