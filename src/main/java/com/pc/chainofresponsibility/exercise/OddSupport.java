package com.pc.chainofresponsibility.exercise;

import com.pc.chainofresponsibility.example.Trouble;

/**
 * 奇数支持类
 * Created by Switch on 2017/3/30.
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        // 问题编号为奇数则解决
        return trouble.getNumber() % 2 == 1;
    }
}
