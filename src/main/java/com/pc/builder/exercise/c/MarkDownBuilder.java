package com.pc.builder.exercise.c;

import com.pc.builder.example.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * MarkDownBuilder
 * Created by Switch on 2017-02-13.
 */
public class MarkDownBuilder extends Builder {
    // 文件名
    private String filename;
    // 编写文档的PrintWriter对象
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        // 标题作为文件名
        this.filename = title + ".md";
        // 创建PrintWriter对象
        try {
            this.writer = new PrintWriter(new FileWriter("E://" + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("# " + title);
        writer.println();
    }

    @Override
    public void makeString(String str) {
        writer.println("## " + str);
    }

    @Override
    public void makeItems(List<String> items) {
        for (String item : items) {
            writer.println("- " + item);
        }
        writer.println();
    }

    @Override
    public void close() {
        writer.println("---------------");
        writer.close();
    }

    public String getResult() {
        return this.filename;
    }
}
