package com.pc.template.example;

/**
 * 字符显示类
 * Created by Switch on 2017-02-03.
 */
public class CharDisplay extends AbstractDisplay {
    // 字符
    private char ch;

    /**
     * 构造方法接收字符
     *
     * @param ch 字符
     */
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(this.ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
