package com.jourwon.designpattern.j2ee.dataaccessobject;

/**
 * Description:使用 StudentDao 来演示数据访问对象模式的用法。
 *
 * @author JourWon
 * @date 2019/7/17 17:52
 */
public class DataAccessObjectPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }
        System.out.println();

        //更新学生
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);
        System.out.println();

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }

}
