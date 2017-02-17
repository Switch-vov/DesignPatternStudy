package com.pc.abstractfactory.example.tablefactory;

import com.pc.abstractfactory.example.factory.Link;

/**
 * 表格链接类
 * Created by Switch on 2017-02-17.
 */
public class TableLink extends Link {
    /**
     * 构造方法，传入标题和URL
     *
     * @param caption 标题
     * @param url     url
     */
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href='" + super.url + "'>" + super.caption + "</a></td>";
    }
}
