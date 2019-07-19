package com.jourwon.designpattern.j2ee.frontcontroller;

/**
 * Description:使用 FrontController 来演示前端控制器设计模式。
 *
 * @author JourWon
 * @date 2019/7/17 18:05
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        System.out.println();

        frontController.dispatchRequest("STUDENT");
    }

}
