package com.jourwon.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 17:36
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Male")) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }
    
}
