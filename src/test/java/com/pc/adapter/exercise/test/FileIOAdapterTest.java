package com.pc.adapter.exercise.test;

import com.pc.adapter.exercise.FileIO;
import com.pc.adapter.exercise.FileProperties;
import org.junit.Test;

import java.io.IOException;

/**
 * 文件IO适配器测试类——类适配器模式
 * Created by switch on 17/1/21.
 */
public class FileIOAdapterTest {
    @Test
    public void testFileIOAdapter() {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("/tmp/file.txt");
            System.out.println(fileIO.getValue("year"));
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("/tmp/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
