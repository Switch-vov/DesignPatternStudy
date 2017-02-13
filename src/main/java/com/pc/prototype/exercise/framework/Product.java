package com.pc.prototype.exercise.framework;

/**
 * 产品接口
 * Created by Switch on 2017-02-13.
 */
public abstract class Product implements Cloneable {
    /**
     * 使用
     *
     * @param s 字符串
     */
    public abstract void use(String s);

    /**
     * 创建一个clone对象
     *
     * @return
     */
    public final Product createClone() {
        Product p = null;
        try {
            // 克隆
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
