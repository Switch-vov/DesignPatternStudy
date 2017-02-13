package com.pc.builder.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 导演类
 * Created by Switch on 2017-02-13.
 */
public class Director {
    // builder对象
    private Builder builder;

    /**
     * 构造方法，传入builder对象
     *
     * @param builder 建造者对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构建文档
     */
    public void construct() {
        // 创建标题
        builder.makeTitle("Greeting");
        // 创建字符串
        builder.makeString("Switch");
        // 创建条目
        List<String> list1 = new ArrayList<>();
        list1.add("早上好");
        list1.add("中午好");
        list1.add("晚上好");
        builder.makeItems(list1);
        // 创建字符串
        builder.makeString("Kity");
        // 创建条目
        List<String> list2 = new ArrayList<>();
        list2.add("晚上好");
        list2.add("中午好");
        list2.add("早上好");
        builder.makeItems(list2);

        // 完成，关闭文档
        builder.close();
    }
}
