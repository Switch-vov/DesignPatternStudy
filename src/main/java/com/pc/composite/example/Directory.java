package com.pc.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类
 * Created by Switch on 2017-02-21.
 */
public class Directory extends Entry {
    /**
     * 文件夹名
     */
    private String name;
    /**
     * 文件夹中的条目集合
     */
    private List<Entry> entries = new ArrayList<>();

    /**
     * 构造方法，传入文件夹名
     *
     * @param name 文件夹名
     */
    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : entries) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        this.entries.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : entries) {
            // 打印文件夹下的文件列表，以文件夹前缀，文件名作为前缀
            entry.printList(prefix + "/" + this.name);
        }
    }
}
