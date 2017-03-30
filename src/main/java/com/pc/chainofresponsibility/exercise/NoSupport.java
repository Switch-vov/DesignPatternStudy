package com.pc.chainofresponsibility.exercise;

import com.pc.chainofresponsibility.example.Trouble;

/**
 * 不支持类
 * Created by Switch on 2017/3/30.
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        // 什么也不处理
        return false;
    }
}
