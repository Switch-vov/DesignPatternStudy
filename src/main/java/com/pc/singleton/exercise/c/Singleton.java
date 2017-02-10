package com.pc.singleton.exercise.c;

/**
 * 单例模式（饿汉式）——检验多线程问题
 * Created by Switch on 2017-02-10.
 */
public class Singleton {
    // 实例对象，静态，饿汉式
    private static Singleton instance = null;

    /**
     * 获取实例对象
     *
     * @return 实例对象
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 私有化构造方法，无法new出来
     */
    private Singleton() {
        try {
            System.out.println("生成了一个实例");
            // 线程休眠一秒，以便于使线程问题更明显
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
