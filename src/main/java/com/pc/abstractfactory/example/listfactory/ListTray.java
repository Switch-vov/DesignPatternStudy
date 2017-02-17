package com.pc.abstractfactory.example.listfactory;

import com.pc.abstractfactory.example.factory.Item;
import com.pc.abstractfactory.example.factory.Tray;

/**
 * 列表Tray类
 * Created by Switch on 2017-02-17.
 */
public class ListTray extends Tray {
    /**
     * 构造方法，传入标题
     *
     * @param caption 标题
     */
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        // 创建StringBuilder对象
        StringBuilder builder = new StringBuilder();
        // 将HTML暂存至StringBuilder对象
        builder.append("<li>\n");
        builder.append(super.caption + "\n");
        builder.append("<ul>\n");
        for (Item item : items) {
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        // 转化为String
        return builder.toString();
    }
}
