package com.jourwon.designpattern.behavioral.mediator;

import java.util.Date;

/**
 * Description:创建中介类。
 *
 * @author JourWon
 * @date 2019/7/17 14:07
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}
