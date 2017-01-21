package com.pc.iterator.example;

/**
 * 书籍类
 * Created by switch on 17/1/19.
 */
public class Book {
    private String name; // 书籍名称

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + '}';
    }
}
