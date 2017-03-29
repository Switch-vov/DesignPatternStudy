package com.pc.visitor.exercise.c;

import com.pc.visitor.example.Element;
import com.pc.visitor.example.Entry;
import com.pc.visitor.example.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 元素数组列表
 * Created by Switch on 2017/3/29.
 */
public class ElementArrayList extends ArrayList<Entry> implements Element {
    @Override
    public void accept(Visitor visitor) {
        Iterator<Entry> it = iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(visitor);
        }
    }
}
