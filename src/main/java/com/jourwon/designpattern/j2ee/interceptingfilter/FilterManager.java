package com.jourwon.designpattern.j2ee.interceptingfilter;

/**
 * Description:创建过滤管理器。
 *
 * @author JourWon
 * @date 2019/7/17 18:18
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
