package com.pc.chainofresponsibility.exercise;

import com.pc.chainofresponsibility.example.Trouble;

/**
 * 限制支持类
 * Created by Switch on 2017/3/30.
 */
public class LimitSupport extends Support {
    /**
     * 可以解决编号小于limit的问题
     */
    private int limit;

    /**
     * 构造方法，设置实例名和limit限制值
     *
     * @param name  实例名
     * @param limit 限制值
     */
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        // 问题编号小于limit则解决问题
        return trouble.getNumber() < limit;
    }
}
