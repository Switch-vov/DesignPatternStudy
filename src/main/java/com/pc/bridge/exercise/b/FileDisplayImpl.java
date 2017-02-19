package com.pc.bridge.exercise.b;

import com.pc.bridge.example.DisplayImpl;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 文件打印实现类
 * Created by Switch on 2017-02-19.
 */
public class FileDisplayImpl extends DisplayImpl {
    // 文件名
    private String fileName;
    // 缓冲字符流
    private BufferedReader reader;

    private final static int MAX_READHEAD_LIMIT = 4096;

    /**
     * 构造方法，传入文件名
     *
     * @param fileName 文件名
     */
    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(this.fileName));
            reader.mark(MAX_READHEAD_LIMIT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("--------------" + this.fileName + "--------------");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("--------------");
        try {
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
