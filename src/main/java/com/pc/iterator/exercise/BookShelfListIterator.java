package com.pc.iterator.exercise;

import com.pc.iterator.example.Book;
import com.pc.iterator.example.Iterator;

/**
 * 书架迭代器(正序遍历迭代器)
 * Created by switch on 17/1/21.
 */
public class BookShelfListIterator implements Iterator<Book> {
    private BookShelfList bookShelf; // 书架

    private int index = 0; // 当前遍历到的对象的索引

    /**
     * 根据书架对象创建书架迭代器对象
     *
     * @param bookShelf 书架
     */
    public BookShelfListIterator(BookShelfList bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (this.index >= bookShelf.getLength()) {
            return false;
        }
        return true;
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
