package com.pc.visitor.exercise.b;

import java.util.ArrayList;
import java.util.Iterator;
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
        SizeVisitor sizeVisitor = new SizeVisitor();
        accept(sizeVisitor);
        return sizeVisitor.getSize();
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 获取迭代器
     *
     * @return 迭代器
     */
    public Iterator<Entry> iterator() {
        return this.entries.iterator();
    }
}
