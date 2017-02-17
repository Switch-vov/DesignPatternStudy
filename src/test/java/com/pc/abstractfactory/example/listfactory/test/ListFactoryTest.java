package com.pc.abstractfactory.example.listfactory.test;

import com.pc.abstractfactory.example.factory.Factory;
import com.pc.abstractfactory.example.factory.Link;
import com.pc.abstractfactory.example.factory.Page;
import com.pc.abstractfactory.example.factory.Tray;
import org.junit.Test;

/**
 * 测试ListFactory
 * Created by Switch on 2017-02-17.
 */
public class ListFactoryTest {

    @Test
    public void testListFactory() {
        Factory factory = Factory.getFactory("com.pc.abstractfactory.example.listfactory.ListFactory");

        Link blog = factory.createLink("博客", "http://blog.csdn.net/q547550831");
        Link github = factory.createLink("Github", "http://www.github.com/Switch-vov");

        Tray mySite = factory.createTray("个人网站");
        mySite.add(blog);
        mySite.add(github);

        Link alibaba = factory.createLink("Alibaba", "http://www.alibaba.com");
        Link baidu = factory.createLink("Baidu", "http://www.baidu.com");

        Tray portal = factory.createTray("大型网站");
        portal.add(alibaba);
        portal.add(baidu);

        Page page = factory.createPage("网站介绍(列表版)", "Switch");
        page.add(mySite);
        page.add(portal);

        page.output();
    }
}
