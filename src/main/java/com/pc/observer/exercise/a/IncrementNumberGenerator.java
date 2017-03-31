package com.pc.observer.exercise.a;

import com.pc.observer.example.NumberGenerator;

/**
 * 递增数值生成器类
 * Created by Switch on 2017/3/31.
 */
public class IncrementNumberGenerator extends NumberGenerator {
    /**
     * 当前数值
     */
    private int number;
    /**
     * 终止数值
     */
    private int end;
    /**
     * 自增数值
     */
    private int inc;

    /**
     * 构造方法，设置开始、终止、自增数值
     *
     * @param start 开始数值
     * @param end   终止数值
     * @param inc   自增数值
     */
    public IncrementNumberGenerator(int start, int end, int inc) {
        this.number = start;
        this.end = end;
        this.inc = inc;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        while (this.number < end) {
            this.notifyObservers();
            this.number += this.inc;
        }
    }
}
