package com.pc.builder.example;

import java.util.List;

/**
 * 文本Builder
 * Created by Switch on 2017-02-13.
 */
public class TextBuilder extends Builder {
    // 文本保存对象
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append("==============================\n");
        stringBuilder.append("[" + title + "]\n");
        stringBuilder.append("\n");
    }

    @Override
    public void makeString(String str) {
        stringBuilder.append("》" + str + "\n");
        stringBuilder.append("\n");
    }

    @Override
    public void makeItems(List<String> items) {
        for (String item : items) {
            stringBuilder.append("》》》" + item + "\n");
        }
        stringBuilder.append("\n");
    }

    @Override
    public void close() {
        stringBuilder.append("==============================\n");
    }

    /**
     * 获取文本
     *
     * @return 文本字符串
     */
    public String getResult() {
        return stringBuilder.toString();
    }
}
