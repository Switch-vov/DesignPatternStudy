package com.pc.abstractfactory.example.tablefactory.test;

import com.pc.abstractfactory.example.factory.Factory;
import com.pc.abstractfactory.example.factory.Link;
import com.pc.abstractfactory.example.factory.Page;
import com.pc.abstractfactory.example.factory.Tray;
import org.junit.Test;

/**
 * TableFactory Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class TableFactoryTest {
    @Test
    public void testTableFactory() {
        Factory factory = Factory.getFactory("com.pc.abstractfactory.example.tablefactory.TableFactory");

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

        Page page = factory.createPage("网站介绍(表格版)", "Switch");
        page.add(mySite);
        page.add(portal);

        page.output();
    }
}
