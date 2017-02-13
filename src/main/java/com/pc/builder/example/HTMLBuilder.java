package com.pc.builder.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 超文本Builder
 * Created by Switch on 2017-02-13.
 */
public class HTMLBuilder extends Builder {
    // 文件名
    private String filename;

    // 编写文档的PrintWriter对象
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        // 将标题作为文件名
        this.filename = title + ".html";
        try {
            // 创建PrintWriter对象
            writer = new PrintWriter(new FileWriter("E:\\" + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title>");
        writer.println("<meta charset='UTF-8'></meta>");
        writer.println("</head><body>");

        // 输出标题
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(List<String> items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    /**
     * 获取文件名
     *
     * @return 文件名
     */
    public String getResult() {
        return this.filename;
    }
}
