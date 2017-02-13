package com.pc.builder.example;

import java.util.List;

/**
 * 建造者类
 * Created by Switch on 2017-02-13.
 */
public abstract class Builder {
    /**
     * 创建标题
     *
     * @param title 标题
     */
    public abstract void makeTitle(String title);

    /**
     * 创建字符串
     *
     * @param str 字符串
     */
    public abstract void makeString(String str);

    /**
     * 创建条目
     *
     * @param items 条目列表
     */
    public abstract void makeItems(List<String> items);

    /**
     * 关闭
     */
    public abstract void close();
}
