package com.pc.abstractfactory.example.tablefactory;

import com.pc.abstractfactory.example.factory.Item;
import com.pc.abstractfactory.example.factory.Page;

/**
 * 表格页面类
 * Created by Switch on 2017-02-17.
 */
public class TablePage extends Page {
    /**
     * 构造方法，传入标题和作者
     *
     * @param title  标题
     * @param author 作者
     */
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        // 创建StringBuilder对象
        StringBuilder builder = new StringBuilder();

        builder.append("<html><head><title>" + super.title + "</title>\n");
        builder.append("<meta charset='utf-8'/>\n");
        builder.append("</head>\n");
        builder.append("<body>\n");
        builder.append("<h1>" + super.title + "</h1>\n");
        builder.append("<table width='80%' border='3'>\n");
        for (Item item : items) {
            builder.append(item.makeHTML());
        }
        builder.append("</table>\n");
        builder.append("<hr/><address>" + this.author + "</address>\n");
        builder.append("</body></html>\n");

        // 转化为String
        return builder.toString();
    }
}
