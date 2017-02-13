package com.pc.builder.execise.c.test;

import com.pc.builder.example.Director;
import com.pc.builder.exercise.c.MarkDownBuilder;
import org.junit.Test;

/**
 * Builder测试类
 * Created by Switch on 2017-02-13.
 */
public class BuilderTest {
    @Test
    public void testMarkDownBuilder() {
        // 创建文本Builder对象
        MarkDownBuilder builder = new MarkDownBuilder();
        // 创建Director类
        Director director = new Director(builder);
        // 创建文本
        director.construct();
        // 获取结果
        String result = builder.getResult();
        System.out.println(result);
    }
}
