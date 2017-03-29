package com.pc.visitor.exercise.b;


import java.util.Iterator;

/**
 * 文件(文件夹)大小访问者
 * Created by Switch on 2017/3/29.
 */
public class SizeVisitor extends Visitor {
    /**
     * 访问文件或文件夹的大小
     */
    private int size;

    @Override
    public void visit(File file) {
        this.size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }

    /**
     * 获取访问文件或文件夹的大小
     *
     * @return 访问文件或文件夹的大小
     */
    public int getSize() {
        return this.size;
    }
}
