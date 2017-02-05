package com.pc.template.example;

/**
 * 抽象显示类
 * Created by Switch on 2017-02-03.
 */
public abstract class AbstractDisplay {
    /**
     * 打开
     */
    public abstract void open();

    /**
     * 打印
     */
    public abstract void print();

    /**
     * 关闭
     */
    public abstract void close();

    /**
     * 显示
     */
    public final void display() {
        // 打开
        open();
        // 打印5次
        for (int i = 0; i < 5; i++) {
            print();
        }
        // 关闭
        close();
    }
}
