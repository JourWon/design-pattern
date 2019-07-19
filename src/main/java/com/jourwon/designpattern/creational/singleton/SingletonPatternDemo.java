package com.jourwon.designpattern.creational.singleton;

/**
 * Description:从 singleton 类获取唯一的对象。
 *
 * @author JourWon
 * @date 2019/7/13 23:38
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        System.out.println(object1);
        System.out.println(object2);

    }

}
