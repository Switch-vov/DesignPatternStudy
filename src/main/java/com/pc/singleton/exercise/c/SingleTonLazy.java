package com.pc.singleton.exercise.c;

/**
 * 单例模式（懒汉式）——静态内部类
 * Created by Switch on 2017-02-10.
 */
public class SingleTonLazy {
    /**
     * 获取实例对象
     *
     * @return 实例对象
     */
    public static SingleTonLazy getInstance() {
        return SingleTon.singleTon;
    }

    /**
     * 静态内部类，只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingleTon {
        private static SingleTonLazy singleTon = new SingleTonLazy();

        static {
            System.out.println("类级别的静态内部类被加载");
        }

        private SingleTon() {
            System.out.println("类级别的静态内部类构造方法被调用");
        }
    }

    /**
     * 私有化构造方法，无法new出来
     */
    private SingleTonLazy() {
        try {
            System.out.println("生成了一个实例");
            // 线程休眠一秒，以便于使线程问题更明显
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
