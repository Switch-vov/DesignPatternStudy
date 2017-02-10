package com.pc.singleton.exercise.c.test;


import com.pc.singleton.exercise.c.SingleTonLazy;
import com.pc.singleton.exercise.c.Singleton;
import com.pc.singleton.exercise.c.SingletonEnum;

/**
 * 多线程单例测试
 * Created by Switch on 2017-02-10.
 */
public class MultithreadingSingletonTest extends Thread {
    public static void main(String[] args) {
        new MultithreadingSingletonTest().start();
        new MultithreadingSingletonTest().start();
        new MultithreadingSingletonTest().start();
    }

    @Override
    public void run() {
        // 线程问题
        Singleton instance1 = Singleton.getInstance();
        System.out.println(this.getName() + ":" + instance1);

        // 静态内部类解决线程问题
        SingleTonLazy instance2 = SingleTonLazy.getInstance();
        System.out.println(this.getName() + ":" + instance2);

        // 枚举解决线程问题
        SingletonEnum instance3 = SingletonEnum.instance;
        System.out.println(this.getName() + ":" + instance3.toString());
    }
}
