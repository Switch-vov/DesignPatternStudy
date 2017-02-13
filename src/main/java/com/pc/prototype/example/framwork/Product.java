package com.pc.prototype.example.framwork;

/**
 * 产品接口
 * Created by Switch on 2017-02-13.
 */
public interface Product extends Cloneable {
    /**
     * 使用
     *
     * @param s 字符串
     */
    void use(String s);

    /**
     * 创建一个clone对象
     *
     * @return
     */
    Product createClone();
}
