package com.pc.iterator.example;

/**
 * 书架类
 * Created by switch on 17/1/19.
 */
public class BookShelf implements Aggregate<Book> {
    private Book[] books; // 书籍数组

    private int last = 0; // 书架上的书籍本书

    /**
     * 根据书籍本数，构建书架
     *
     * @param bookSize 书籍本数
     */
    public BookShelf(int bookSize) {
        books = new Book[bookSize];
    }

    /**
     * 根据索引获取书籍中的书籍
     *
     * @param index 索引
     * @return 索引对应的书籍
     * @throws ArrayIndexOutOfBoundsException
     */
    public Book getBookAt(int index) throws ArrayIndexOutOfBoundsException {
        return books[index];
    }

    /**
     * 获取书架上的书籍本书
     *
     * @return 书籍本书
     */
    public int getLength() {
        return this.last;
    }

    /**
     * 添加书籍到书架末尾
     *
     * @param book 书籍
     */
    public void add(Book book) {
        books[last++] = book;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
