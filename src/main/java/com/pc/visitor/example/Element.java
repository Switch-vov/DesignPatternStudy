package com.pc.visitor.example;

/**
 * 元素接口（代表可以接受访问）
 * Created by Switch on 2017-02-22.
 */
public interface Element {
    /**
     * 接受访问者对象访问
     *
     * @param visitor 访问者对象
     */
    void accept(Visitor visitor);
}
