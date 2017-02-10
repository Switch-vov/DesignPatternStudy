package com.pc.singleton.example;

/**
 * 单例模式（饿汉式）
 * Created by Switch on 2017-02-10.
 */
public class Singleton {
    // 实例对象，静态，饿汉式
    private static Singleton instance = new Singleton();

    /**
     * 获取实例对象
     *
     * @return 实例对象
     */
    public static Singleton getInstance() {
        return instance;
    }

    /**
     * 私有化构造方法，无法new出来
     */
    private Singleton() {
        System.out.println("生成了一个实例");
    }
}
