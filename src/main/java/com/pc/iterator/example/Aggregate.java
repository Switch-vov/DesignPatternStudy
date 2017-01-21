package com.pc.iterator.example;

/**
 * 集合接口
 * Created by switch on 17/1/18.
 */
public interface Aggregate<T> {
    /**
     * 返回迭代器
     *
     * @return 迭代器对象
     */
    Iterator<T> iterator();
}
