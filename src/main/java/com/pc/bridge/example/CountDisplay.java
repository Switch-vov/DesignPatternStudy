package com.pc.bridge.example;

/**
 * 计数打印类（功能层次）
 * Created by Switch on 2017-02-18.
 */
public class CountDisplay extends Display {
    /**
     * 构造方法，传入显示实现对象
     *
     * @param displayImpl 显示实现对象
     */
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    /**
     * 打印多次
     *
     * @param times 次数
     */
    public void multiDisplay(int times) {
        this.open();
        for (int i = 0; i < times; i++) {
            this.print();
        }
        this.close();
    }
}
