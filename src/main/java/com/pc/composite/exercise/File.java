package com.pc.composite.exercise;

/**
 * 文件类
 * Created by Switch on 2017-02-21.
 */
public class File extends Entry {
    /**
     * 文件名
     */
    private String name;

    /**
     * 文件占用空间
     */
    private int size;

    /**
     * 构造方法，传入文件名和文件占用空间
     *
     * @param name 文件名
     * @param size 文件占用空间
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
