package com.jourwon.designpattern.behavioral.visitor;


/**
 * Description:定义一个表示访问者的接口。
 *
 * @author JourWon
 * @date 2019/7/17 16:06
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
