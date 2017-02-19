package com.pc.bridge.exercise.c;

import com.pc.bridge.example.DisplayImpl;

/**
 * 字符打印实现类
 * Created by Switch on 2017-02-19.
 */
public class CharDiplayImpl extends DisplayImpl {
    // 起始字符
    private char head;
    // 装饰字符
    private char body;
    // 结束字符
    private char foot;

    /**
     * 构造方法，传入
     *
     * @param head
     * @param body
     * @param foot
     */
    public CharDiplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    public void rawOpen() {
        System.out.print(this.head);
    }

    @Override
    public void rawPrint() {
        System.out.print(this.body);
    }

    @Override
    public void rawClose() {
        System.out.println(this.foot);
    }
}
