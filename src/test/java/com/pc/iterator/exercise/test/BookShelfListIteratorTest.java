package com.pc.iterator.exercise.test;

import com.pc.iterator.example.Book;
import com.pc.iterator.example.Iterator;
import com.pc.iterator.exercise.BookShelfList;
import org.junit.Before;
import org.junit.Test;

/**
 * 书架迭代器测试
 * Created by switch on 17/1/21.
 */
public class BookShelfListIteratorTest {
    BookShelfList bookShelf;

    /**
     * 初始化方法
     */
    @Before
    public void init() {
        bookShelf = new BookShelfList(20);
        // 添加一些书籍
        Book book1 = new Book("图解设计模式");
        Book book2 = new Book("Spring实战");
        Book book3 = new Book("设计模式");
        Book book4 = new Book("深入分析Java Web技术内幕");
        Book book5 = new Book("大型网站技术架构 核心原理与案例分析");
        Book book6 = new Book("情商");
        Book book7 = new Book("三体");
        Book book8 = new Book("银河帝国");
        Book book9 = new Book("神们自己");
        Book book10 = new Book("信息简史");

        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);
        bookShelf.add(book5);
        bookShelf.add(book6);
        bookShelf.add(book7);
        bookShelf.add(book8);
        bookShelf.add(book9);
        bookShelf.add(book10);
    }


    /**
     * 测试迭代器
     */
    @Test
    public void testIterator() {
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
