package com.jourwon.designpattern.j2ee.frontcontroller;

/**
 * Description:创建调度器 Dispatcher。
 *
 * @author JourWon
 * @date 2019/7/17 17:58
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }

}
