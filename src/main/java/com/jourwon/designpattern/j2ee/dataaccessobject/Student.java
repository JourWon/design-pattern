package com.jourwon.designpattern.j2ee.dataaccessobject;

/**
 * Description:创建数值对象。
 *
 * @author JourWon
 * @date 2019/7/17 17:50
 */
public class Student {

    private String name;
    private int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
