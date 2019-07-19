package com.jourwon.designpattern.j2ee.mvc;

/**
 * Description:使用 StudentController 方法来演示 MVC 设计模式的用法。
 *
 * @author JourWon
 * @date 2019/7/17 16:36
 */
public class MvcPatternDemo {

    public static void main(String[] args) {

        //从数据可获取学生记录
        Student model = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
        System.out.println();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}
