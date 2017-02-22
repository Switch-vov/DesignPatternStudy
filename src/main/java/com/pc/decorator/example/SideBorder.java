package com.pc.decorator.example;

/**
 * 侧面边框装饰类
 * Created by Switch on 2017-02-21.
 */
public class SideBorder extends Border {
    /**
     * 装饰字符
     */
    private char decorateChar;

    /**
     * 构造方法，传入待装饰的显示类对象
     *
     * @param display 显示类对象
     */
    public SideBorder(Display display, char decorateChar) {
        super(display);
        this.decorateChar = decorateChar;
    }

    @Override
    public int getColumns() {
        return this.display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return this.display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 在两边加上装饰字符
        return this.decorateChar + display.getRowText(row) + this.decorateChar;
    }
}
