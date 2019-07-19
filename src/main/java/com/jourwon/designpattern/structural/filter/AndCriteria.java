package com.jourwon.designpattern.structural.filter;

import java.util.List;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 17:40
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> list = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(list);
    }

}
