package com.pc.builder.exercise.b;

import java.util.List;

/**
 * 建造者类
 * Created by Switch on 2017-02-13.
 */
public abstract class Builder {
    private boolean initialized = false;

    /**
     * 创建标题的模版方法
     *
     * @param title 标题
     */
    public void makeTitle(String title) {
        if (!initialized) {
            this.buildTitle(title);
            initialized = true;
        }
    }

    /**
     * 创建标题，供子类实现
     *
     * @param title 标题
     */
    public abstract void buildTitle(String title);

    /**
     * 创建字符串的模版方法
     *
     * @param str 字符串
     */
    public void makeString(String str) {
        if (this.initialized) {
            buildString(str);
        }
    }

    /**
     * 创建字符串，供子类实现
     *
     * @param str 字符串
     */
    public abstract void buildString(String str);

    /**
     * 创建条目的模版方法
     *
     * @param items 条目列表
     */
    public void makeItems(List<String> items) {
        if (this.initialized) {
            buildItems(items);
        }
    }


    /**
     * 创建条目，供子类实现
     *
     * @param items 条目列表
     */
    public abstract void buildItems(List<String> items);

    /**
     * 关闭的模版方法
     */
    public void close() {
        if (initialized) {
            this.buildDone();
        }
    }

    /**
     * 关闭，供子类实现
     */
    public abstract void buildDone();
}
