package com.pc.abstractfactory.example.factory;

/**
 * 链接类(抽象零件)
 * Created by Switch on 2017-02-17.
 */
public abstract class Link extends Item {
    // url
    protected String url;


    /**
     * 构造方法，传入标题和URL
     *
     * @param caption 标题
     * @param url     url
     */
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
