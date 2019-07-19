package com.jourwon.designpattern.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Description:使用CAS锁实现（线程安全）
 *
 * @author JourWon
 * @date 2019/7/14 0:11
 */
public class Singleton9 {

    private static final AtomicReference<Singleton9> INSTANCE = new AtomicReference<Singleton9>();

    private Singleton9() {
    }

    public static Singleton9 getInstance() {
        for (; ; ) {
            Singleton9 current = INSTANCE.get();

            if (current != null) {
                return current;
            }

            current = new Singleton9();

            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }

}
