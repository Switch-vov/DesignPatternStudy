package com.pc.bridge.example;

/**
 * 显示
 * Created by Switch on 2017-02-18.
 */
public class Display {
    // 显示实现对象（实现层次）
    private DisplayImpl displayImpl;


    /**
     * 构造方法，传入显示实现对象
     *
     * @param displayImpl 显示实现对象
     */
    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    /**
     * 打开
     */
    public void open() {
        this.displayImpl.rawOpen();
    }

    /**
     * 打印
     */
    public void print() {
        this.displayImpl.rawPrint();
    }

    /**
     * 关闭
     */
    public void close() {
        this.displayImpl.rawClose();
    }

    /**
     * 打印
     */
    public void display() {
        this.open();
        this.print();
        this.close();
    }
}
