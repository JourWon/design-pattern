package com.jourwon.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/15 17:38
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }

}
