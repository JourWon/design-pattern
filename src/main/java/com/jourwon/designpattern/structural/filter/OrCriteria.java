package com.jourwon.designpattern.structural.filter;

import java.util.List;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 17:53
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> other = otherCriteria.meetCriteria(persons);

        for (Person person : other) {
            if (!first.contains(person)) {
                first.add(person);
            }
        }

        return first;
    }

}
