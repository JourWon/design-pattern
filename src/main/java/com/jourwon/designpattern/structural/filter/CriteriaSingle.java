package com.jourwon.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 17:39
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }

}
