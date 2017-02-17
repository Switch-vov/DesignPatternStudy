package com.pc.abstractfactory.example.factory;

/**
 * HTML中的一项(抽象零件)
 * Created by Switch on 2017-02-17.
 */
public abstract class Item {
    // 标题
    protected String caption;

    /**
     * 构造方法，传入标题
     *
     * @param caption 标题
     */
    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 创建HTML
     *
     * @return HTML格式的字符串
     */
    public abstract String makeHTML();
}
