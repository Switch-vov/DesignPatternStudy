package com.pc.facade.exercise;

import com.pc.facade.example.Database;
import com.pc.facade.example.HtmlWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * 页面Maker类
 * Created by Switch on 2017/3/30.
 */
public final class PageMaker {
    /**
     * 防止外部new出PageMaker的实例，所以声明为private方法
     */
    private PageMaker() {
    }

    /**
     * 创建邮件集合页面
     *
     * @param filename 文件名
     */
    public static void makeLinkPage(String filename) {
        try {
            Properties prop = Database.getProperties(System.getProperty("user.dir") + "/src/main/java/com/pc/facade/example/maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter("D://" + filename));
            writer.title("Link page");
            for (Map.Entry<Object, Object> entry : prop.entrySet()) {
                writer.mailto(entry.getKey().toString(), entry.getValue().toString());
            }
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
