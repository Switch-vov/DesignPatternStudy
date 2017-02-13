package com.pc.builder.example.test;

        import com.pc.builder.example.Director;
        import com.pc.builder.example.HTMLBuilder;
        import com.pc.builder.example.TextBuilder;
        import org.junit.Test;

/**
 * 建造者测试类
 * Created by Switch on 2017-02-13.
 */
public class BuilderTest {
    @Test
    public void testTextBuilder() {
        // 创建文本Builder对象
        TextBuilder builder = new TextBuilder();
        // 创建Director类
        Director director = new Director(builder);
        // 创建文本
        director.construct();
        // 获取结果
        String result = builder.getResult();
        System.out.println(result);
    }

    @Test
    public void testHTMLBuilder() {
        // 创建超文本Builder对象
        HTMLBuilder builder = new HTMLBuilder();
        // 创建Director类
        Director director = new Director(builder);
        // 创建文本
        director.construct();
        // 获取结果
        String result = builder.getResult();
        System.out.println(result);
    }
}
