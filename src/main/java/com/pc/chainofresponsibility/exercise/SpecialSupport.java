package com.pc.chainofresponsibility.exercise;

import com.pc.chainofresponsibility.example.Trouble;

/**
 * 特殊支持类
 * Created by Switch on 2017/3/30.
 */
public class SpecialSupport extends Support {
    /**
     * 只解决特定编号的问题
     */
    private int number;

    /**
     * 构造方法，设置实例名和特定编号
     *
     * @param name   实例名
     * @param number 特定编号
     */
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        // 特定编号则解决
        return trouble.getNumber() == number;
    }
}
