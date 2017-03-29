package com.pc.visitor.exercise.b;


/**
 * 访问者抽象类
 * Created by Switch on 2017-02-22.
 */
public abstract class Visitor {
    /**
     * 访问文件
     *
     * @param file 文件对象
     */
    public abstract void visit(File file);

    /**
     * 访问文件夹
     *
     * @param directory 文件夹对象
     */
    public abstract void visit(Directory directory);
}
