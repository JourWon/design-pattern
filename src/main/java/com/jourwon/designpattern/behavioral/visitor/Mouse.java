package com.jourwon.designpattern.behavioral.visitor;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 16:08
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
