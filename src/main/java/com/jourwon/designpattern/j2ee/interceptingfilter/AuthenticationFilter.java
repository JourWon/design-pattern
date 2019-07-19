package com.jourwon.designpattern.j2ee.interceptingfilter;

/**
 * Description:创建实体过滤器。
 *
 * @author JourWon
 * @date 2019/7/17 18:12
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }

}
