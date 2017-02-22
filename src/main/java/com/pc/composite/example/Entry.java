package com.pc.composite.example;

/**
 * 条目抽象类
 * Created by Switch on 2017-02-21.
 */
public abstract class Entry {
    /**
     * 获取名字
     *
     * @return 名字
     */
    public abstract String getName();

    /**
     * 获取占用空间
     *
     * @return 占用空间
     */
    public abstract int getSize();

    /**
     * 添加
     *
     * @param entry 条目对象
     * @return 返回文件夹对象
     * @throws FileTreatmentException 文件处理异常
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException("只有文件夹才能添加条目！");
    }

    /**
     * 使用默认前缀，显示目录条目
     */
    public void printList() {
        printList("");
    }

    /**
     * 指定前缀，显示目录条目
     *
     * @param prefix 前缀
     */
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return this.getName() + " (" + this.getSize() + ")";
    }
}
