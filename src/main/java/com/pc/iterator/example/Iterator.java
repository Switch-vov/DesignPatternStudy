package com.pc.iterator.example;

/**
 * 迭代器接口
 * Created by switch on 17/1/18.
 */
public interface Iterator<T> {
    /**
     * 是否有下一个对象
     *
     * @return true, 有;false,无
     */
    boolean hasNext();

    /**
     * 获取下一个对象
     *
     * @return 下一个对象
     */
    T next();
}
