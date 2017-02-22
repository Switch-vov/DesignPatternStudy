package com.pc.decorator.example;

/**
 * 字符串显示类
 * Created by Switch on 2017-02-21.
 */
public class StringDisplay extends Display {
    /**
     * 带显示的字符串
     */
    private String string;

    /**
     * 构造方法，传入字符串
     *
     * @param string 字符串
     */
    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return this.string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return this.string;
        }
        return null;
    }
}
