package com.pc.template.example;

/**
 * 字符串显示类
 * Created by Switch on 2017-02-03.
 */
public class StringDisplay extends AbstractDisplay {
    // 字符串
    private String string;

    // 字符串字节长度
    private int width;

    /**
     * 构造方法接收字符串
     *
     * @param string 字符串
     */
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    /**
     * 打印一行，如下
     * +------------+
     */
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < this.width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
