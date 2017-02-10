package com.pc.singleton.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 单例模式(懒汉式)——枚举
 * Created by Switch on 2017-02-10.
 */
public enum SingletonEnum {
    /**
     * 1.从Java1.5开始支持;
     * 2.无偿提供序列化机制;
     * 3.绝对防止多次实例化，即使在面对复杂的序列化或者反射攻击的时候;
     */
    instance;

    private String others;

    public List<String> buildlList() {
        final List<String> list = new ArrayList<>();
        list.add("Switch");
        list.add("Kity");
        list.add("Tom");

        return list;
    }

    private SingletonEnum() {

    }
}