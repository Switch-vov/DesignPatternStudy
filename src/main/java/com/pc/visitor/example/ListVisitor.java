package com.pc.visitor.example;

import java.util.Iterator;

/**
 * 列表访问类
 * Created by Switch on 2017-02-22.
 */
public class ListVisitor extends Visitor {
    /**
     * 当前访问的文件夹的名字
     */
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(this.currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        // 递归调用，回溯法
        String saveDir = this.currentDir;
        this.currentDir = this.currentDir + "/" + directory.getName();
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
        this.currentDir = saveDir;
    }
}
