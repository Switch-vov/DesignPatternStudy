package com.pc.adapter.exercise;

import java.io.IOException;

/**
 * 文件IO
 */
public interface FileIO {
    /**
     * 从文件中读取
     *
     * @param filename 文件名
     * @throws IOException
     */
    void readFromFile(String filename) throws IOException;

    /**
     * 写入文件
     *
     * @param filename
     * @throws IOException
     */
    void writeToFile(String filename) throws IOException;

    /**
     * 设置键值对
     *
     * @param key   键
     * @param value 值
     */
    void setValue(String key, String value);

    /**
     * 通过键获取对应值
     *
     * @param key 键
     * @return 值
     */
    String getValue(String key);
}