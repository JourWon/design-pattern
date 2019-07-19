package com.jourwon.designpattern.structural.filter;

/**
 * Description:创建一个类，在该类上应用标准。
 *
 * @author JourWon
 * @date 2019/7/15 17:28
 */
public class Person {

    private String name;

    private String gender;

    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
