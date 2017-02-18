package com.pc.abstractfactory.exercise;

import com.pc.abstractfactory.example.factory.Link;
import com.pc.abstractfactory.example.factory.Page;
import com.pc.abstractfactory.example.factory.Tray;
import com.pc.abstractfactory.example.listfactory.ListLink;
import com.pc.abstractfactory.example.listfactory.ListPage;
import com.pc.abstractfactory.example.listfactory.ListTray;

/**
 * Created by Switch on 2017-02-17.
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
