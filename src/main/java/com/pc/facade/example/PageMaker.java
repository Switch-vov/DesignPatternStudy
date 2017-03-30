package com.pc.facade.example;

import java.io.FileWriter;
import java.io.IOException;
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
     * 创建欢迎页
     *
     * @param mailAddress 邮箱地址
     * @param filename    文件名
     */
    public static void makeWelcomePage(String mailAddress, String filename) {
        try {
            Properties mailprop = Database.getProperties(System.getProperty("user.dir") + "/src/main/java/com/pc/facade/example/maildata");
            String username = mailprop.getProperty(mailAddress);
            HtmlWriter writer = new HtmlWriter(new FileWriter("D://" + filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddress, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddress + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
