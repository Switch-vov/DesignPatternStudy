package com.pc.flyweight.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 大字符类
 * Created by Switch on 2017/3/31.
 */
public class BigChar {
    /**
     * 字符名称
     */
    private char charname;

    /**
     * 大型字符对应的字符串(由'#' '.' '\n'组成)
     */
    private String fontdata;

    /**
     * 构造方法，设置字符名称，并初始化数据
     *
     * @param charname 字符名称
     */
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")
                    + "/src/main/java/com/pc/flyweight/example/char/big" + charname + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?\n";
        }
    }

    /**
     * 显示大型字符
     */
    public void print() {
        System.out.print(fontdata);
    }
}
