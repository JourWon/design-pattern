package com.jourwon.designpattern.behavioral.visitor;

/**
 * Description:定义一个表示元素的接口。
 *
 * @author JourWon
 * @date 2019/7/17 16:04
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
