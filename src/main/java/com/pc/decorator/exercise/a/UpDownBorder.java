package com.pc.decorator.exercise.a;

import com.pc.decorator.example.Border;
import com.pc.decorator.example.Display;

/**
 * 上下边框装饰类
 * Created by Switch on 2017-02-22.
 */
public class UpDownBorder extends Border {

    /**
     * 装饰字符
     */
    private char decorateChar;

    /**
     * 构造方法，传入待装饰的显示类对象
     *
     * @param display 显示类对象
     */
    public UpDownBorder(Display display, char decorateChar) {
        super(display);
        this.decorateChar = decorateChar;
    }

    @Override
    public int getColumns() {
        return this.display.getColumns();
    }

    @Override
    public int getRows() {
        return this.display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return this.printLine(this.display.getColumns());
        } else if (row == this.display.getRows() + 1) {
            return this.printLine(this.display.getColumns());
        } else {
            return this.display.getRowText(row - 1);
        }
    }

    /**
     * 打印一行
     *
     * @param count 次数
     * @return count次装饰字符
     */
    private String printLine(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(this.decorateChar);
        }
        return builder.toString();
    }
}
