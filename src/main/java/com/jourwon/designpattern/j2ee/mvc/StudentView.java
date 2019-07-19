package com.jourwon.designpattern.j2ee.mvc;

/**
 * Description:创建视图。
 *
 * @author JourWon
 * @date 2019/7/17 16:33
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}
