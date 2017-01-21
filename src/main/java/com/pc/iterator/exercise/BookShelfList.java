package com.pc.iterator.exercise;

import com.pc.iterator.example.Aggregate;
import com.pc.iterator.example.Book;
import com.pc.iterator.example.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架类——使用集合框架实现
 * Created by switch on 17/1/21.
 */
public class BookShelfList implements Aggregate<Book> {

    // 书籍列表
    private List<Book> books;

    /**
     * 创建初始大小为bookSize的书架
     *
     * @param bookSize 初始大小
     */
    public BookShelfList(int bookSize) {
        books = new ArrayList<>(bookSize);
    }

    /**
     * 通过索引获取书籍
     *
     * @param index 索引
     * @return 书籍
     */
    public Book getBookAt(int index) {
        return books.get(index);
    }

    /**
     * 获取书架上的书籍本书
     *
     * @return 书籍本书
     */
    public int getLength() {
        return books.size();
    }

    /**
     * 添加书籍
     *
     * @param book 书籍
     */
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfListIterator(this);
    }
}
