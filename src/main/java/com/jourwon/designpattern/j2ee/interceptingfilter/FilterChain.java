package com.jourwon.designpattern.j2ee.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:创建过滤器链。
 *
 * @author JourWon
 * @date 2019/7/17 18:17
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }

}
