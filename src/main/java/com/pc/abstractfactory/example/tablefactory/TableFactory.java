package com.pc.abstractfactory.example.tablefactory;

import com.pc.abstractfactory.example.factory.Factory;
import com.pc.abstractfactory.example.factory.Link;
import com.pc.abstractfactory.example.factory.Page;
import com.pc.abstractfactory.example.factory.Tray;

/**
 * 表格工厂类
 * Created by Switch on 2017-02-17.
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
