package com.pc.iterator.example;

/**
 * 书架迭代器(正序遍历迭代器)
 * Created by switch on 17/1/19.
 */
public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf; // 书架

    private int index = 0; // 当前遍历到的对象的索引

    /**
     * 根据书架对象创建书架迭代器对象
     *
     * @param bookShelf 书架
     */
    public BookShelfIterator(BookShelf bookShelf) {
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
