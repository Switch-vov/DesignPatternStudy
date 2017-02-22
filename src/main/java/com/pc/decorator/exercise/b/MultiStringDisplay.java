package com.pc.decorator.exercise.b;


import com.pc.decorator.example.Display;

import java.util.ArrayList;
import java.util.List;

/**
 * 多行字符串显示类
 * Created by Switch on 2017-02-22.
 */
public class MultiStringDisplay extends Display {
    /**
     * 字符串列表
     */
    private List<String> stringList = new ArrayList<>();

    /**
     * 最大字符数
     */
    private int columns;

    /**
     * 添加字符串
     *
     * @param string 字符串
     */
    public void add(String string) {
        this.stringList.add(string);
        this.updateColumn(string);
    }

    @Override
    public int getColumns() {
        return this.columns;
    }

    @Override
    public int getRows() {
        return this.stringList.size();
    }

    @Override
    public String getRowText(int row) {
        return stringList.get(row);
    }

    /**
     * 更新行字符
     *
     * @param string 传入字符串
     */
    private void updateColumn(String string) {
        if (string.getBytes().length > this.columns) {
            this.columns = string.getBytes().length;
        }
        for (int i = 0; i < stringList.size(); i++) {
            int fills = this.columns - stringList.get(i).getBytes().length;
            if (fills > 0) {
                this.stringList.set(i, stringList.get(i) + this.fillSpaces(fills));
            }
        }

    }

    /**
     * 填入count位空格
     *
     * @param count 位数
     * @return 空格字符串
     */
    private String fillSpaces(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }
}
