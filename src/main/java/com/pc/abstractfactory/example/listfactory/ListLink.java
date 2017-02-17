package com.pc.abstractfactory.example.listfactory;

import com.pc.abstractfactory.example.factory.Link;

/**
 * 列表链接类
 * Created by Switch on 2017-02-17.
 */
public class ListLink extends Link {
    /**
     * 构造方法，传入标题和URL
     *
     * @param caption 标题
     * @param url     url
     */
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href='" + super.url + "'>" + super.caption + "</a></li>\n";
    }
}
