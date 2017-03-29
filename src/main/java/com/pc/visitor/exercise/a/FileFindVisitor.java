package com.pc.visitor.exercise.a;

import com.pc.visitor.example.Directory;
import com.pc.visitor.example.Entry;
import com.pc.visitor.example.File;
import com.pc.visitor.example.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 文件搜寻访问者
 * Created by Switch on 2017/3/29.
 */
public class FileFindVisitor extends Visitor {
    /**
     * 文件类型
     */
    private String fileTye;
    /**
     * 已找到文件列表
     */
    private List<File> found = new ArrayList<>();

    public FileFindVisitor(String fileType) {
        this.fileTye = fileType;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(fileTye)) {
            this.found.add(file);
        }
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
     * 获取已找到文件
     *
     * @return 已找到文件列表迭代器
     */
    public Iterator<File> getFoundFiles() {
        return this.found.iterator();
    }
}
