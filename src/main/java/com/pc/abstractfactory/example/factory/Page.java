package com.pc.abstractfactory.example.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 页面类(抽象产品)
 * Created by Switch on 2017-02-17.
 */
public abstract class Page {
    // 标题
    protected String title;
    // 作者
    protected String author;
    // 页面内容列表
    protected List<Item> items = new ArrayList<>();

    /**
     * 构造方法，传入标题和作者
     *
     * @param title  标题
     * @param author 作者
     */
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 添加HTML项到内容给列表
     *
     * @param item HTML项
     */
    public void add(Item item) {
        this.items.add(item);
    }

    public void output() {
        try {
            // 创建文件，并使用makeHTML将内容输出到文件中
            String filename = title + ".html";
            Writer writer = new FileWriter("E:\\" + filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "已编写完成。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建HTML
     *
     * @return HTML格式的字符串
     */
    public abstract String makeHTML();

}
