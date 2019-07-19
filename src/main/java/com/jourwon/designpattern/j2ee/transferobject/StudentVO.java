package com.jourwon.designpattern.j2ee.transferobject;

/**
 * Description:创建传输对象。
 *
 * @author JourWon
 * @date 2019/7/19 13:39
 */
public class StudentVO {

    private String name;
    private int rollNo;

    StudentVO(String name, int rollNo){
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
