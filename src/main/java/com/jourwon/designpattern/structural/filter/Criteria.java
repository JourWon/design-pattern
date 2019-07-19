package com.jourwon.designpattern.structural.filter;

import java.util.List;

/**
 * Description:为标准（Criteria）创建一个接口。
 *
 * @author JourWon
 * @date 2019/7/15 17:30
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
