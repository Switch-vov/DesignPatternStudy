package com.pc.decorator.example;

/**
 * 显示抽象类
 * Created by Switch on 2017-02-21.
 */
public abstract class Display {
    /**
     * 获取每行的字符数
     *
     * @return 每行的字符数
     */
    public abstract int getColumns();

    /**
     * 获取行数
     *
     * @return 行数
     */
    public abstract int getRows();

    /**
     * 获取指定行的文本
     *
     * @param row 行数
     * @return 文本
     */
    public abstract String getRowText(int row);

    /**
     * 全部显示
     */
    public final void show() {
        for (int i = 0; i < this.getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
