package com.jourwon.designpattern.behavioral.mediator;

/**
 * Description:创建 user 类。
 *
 * @author JourWon
 * @date 2019/7/17 14:07
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

}
