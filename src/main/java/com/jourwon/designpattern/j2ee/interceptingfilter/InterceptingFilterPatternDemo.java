package com.jourwon.designpattern.j2ee.interceptingfilter;

/**
 * Description:使用 Client 来演示拦截过滤器设计模式。
 *
 * @author JourWon
 * @date 2019/7/17 18:18
 */
public class InterceptingFilterPatternDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }

}
