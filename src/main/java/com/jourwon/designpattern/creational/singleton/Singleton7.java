package com.jourwon.designpattern.creational.singleton;

/**
 * Description:volatile关键字
 * 对于Double-Check这种可能出现的问题（当然这种概率已经非常小了，但毕竟还是有的嘛~），
 * 解决方案是：只需要给instance的声明加上volatile关键字即可
 *
 * volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，
 * 对它的写操作就会有一个内存屏障（什么是内存屏障？），这样，在它的赋值完成之前，就不用会调用读操作。
 *
 * 注意：volatile阻止的不是singleton = newSingleton()这句话内部[1-2-3]的指令重排，
 * 而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
 *
 * @author JourWon
 * @date 2019/7/14 0:24
 */
public class Singleton7 {

    private static volatile Singleton7 instance = null;

    private Singleton7() {}

    public static Singleton7 getInstance() {
        if (instance == null) {
            synchronized (Singleton7.class) {
                if (instance == null) {
                    instance = new Singleton7();
                }
            }
        }

        return instance;
    }

}
