package com.pc.bridge.example;

/**
 * 字符串打印实现类
 * Created by Switch on 2017-02-18.
 */
public class StringDisplayImpl extends DisplayImpl {
    // 字符串
    private String string;
    // 字符串的字节码长度
    private Integer width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        this.printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void rawClose() {
        this.printLine();
    }

    /**
     * 打印一行
     */
    private void printLine() {
        // 打印如 +----------+这样的一行
        System.out.print("+");
        for (int i = 0; i < this.width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
