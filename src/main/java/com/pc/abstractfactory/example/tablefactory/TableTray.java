package com.pc.abstractfactory.example.tablefactory;

import com.pc.abstractfactory.example.factory.Item;
import com.pc.abstractfactory.example.factory.Tray;

/**
 * 表格Tray类
 * Created by Switch on 2017-02-17.
 */
public class TableTray extends Tray {
    /**
     * 构造方法，传入标题
     *
     * @param caption 标题
     */
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        // 创建StringBuilder对象
        StringBuilder builder = new StringBuilder();

        // 将HTML暂存至StringBuilder对象
        builder.append("<td>");
        builder.append("<table width='100%' border='l'><tr>");
        builder.append("<td bgcolor='#cccccc' align='center' colspan='" + super.items.size() + "'><b>" + caption + "</b></td>");
        builder.append("</tr>\n");
        builder.append("<tr>\n");
        for (Item item : items) {
            builder.append(item.makeHTML());
        }
        builder.append("</tr></table>");
        builder.append("</td>");

        // 转化为String
        return builder.toString();
    }
}
