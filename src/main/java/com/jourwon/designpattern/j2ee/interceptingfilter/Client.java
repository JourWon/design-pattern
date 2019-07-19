package com.jourwon.designpattern.j2ee.interceptingfilter;

/**
 * Description:创建客户端 Client。
 *
 * @author JourWon
 * @date 2019/7/17 18:18
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
