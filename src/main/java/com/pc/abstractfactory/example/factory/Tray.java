package com.pc.abstractfactory.example.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 存放多个HTML项(抽象零件)
 * Created by Switch on 2017-02-17.
 */
public abstract class Tray extends Item {
    // HTML项列表
    protected List<Item> items = new ArrayList<>();

    /**
     * 构造方法，传入标题
     *
     * @param caption 标题
     */
    public Tray(String caption) {
        super(caption);
    }

    /**
     * 添加HTML项
     *
     * @param item HTML项
     */
    public void add(Item item) {
        this.items.add(item);
    }
}
