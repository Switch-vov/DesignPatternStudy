package com.pc.facade.example;

import java.io.IOException;
import java.io.Writer;

/**
 * Html编写类
 * Created by Switch on 2017/3/30.
 */
public class HtmlWriter {
    /**
     * 编写器
     */
    private Writer writer;

    /**
     * 构造方法，设置编写器
     *
     * @param writer 编写器
     */
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    /**
     * 输出标题
     *
     * @param title 标题
     * @throws IOException IO异常
     */
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("<meta charset='UTF-8'/>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    /**
     * 输出段落
     *
     * @param msg 信息
     * @throws IOException IO异常
     */
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>\n");
    }

    /**
     * 输出超链接
     *
     * @param href    链接
     * @param caption 标题
     * @throws IOException IO异常
     */
    public void link(String href, String caption) throws IOException {
        this.paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    /**
     * 输出邮件地址
     *
     * @param mailAddress 邮件地址
     * @param userName    用户名
     * @throws IOException IO异常
     */
    public void mailto(String mailAddress, String userName) throws IOException {
        link("mailto:" + mailAddress, userName);
    }

    /**
     * 结束输出HTML
     *
     * @throws IOException IO异常
     */
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }

}
