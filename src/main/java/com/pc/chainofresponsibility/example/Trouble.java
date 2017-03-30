package com.pc.chainofresponsibility.example;

/**
 * 问题类
 * Created by Switch on 2017/3/30.
 */
public class Trouble {
    /**
     * 问题编号
     */
    private int number;

    /**
     * 构造方法，设置问题编号
     *
     * @param number 问题标号
     */
    public Trouble(int number) {
        this.number = number;
    }

    /**
     * 获取问题编号
     *
     * @return 问题编号
     */
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{ number=" + number + "}";
    }
}
