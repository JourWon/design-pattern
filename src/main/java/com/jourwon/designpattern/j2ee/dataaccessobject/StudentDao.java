package com.jourwon.designpattern.j2ee.dataaccessobject;

import java.util.List;

/**
 * Description:创建数据访问对象接口。
 *
 * @author JourWon
 * @date 2019/7/17 17:50
 */
public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);

}
