package com.pc.flyweight.exercise.b;

import com.pc.flyweight.example.BigChar;
import com.pc.flyweight.example.BigCharFactory;

/**
 * 大字符串
 * Created by Switch on 2017/3/31.
 */
public class BigString {
    /**
     * 大字符数组
     */
    private BigChar[] bigChars;

    /**
     * 构造方法，传入字符串
     *
     * @param string 字符串
     */
    public BigString(String string) {
        this(string, true);
    }

    /**
     * 构造方法，传入字符串，是否共享大字符实例
     *
     * @param string 字符串
     * @param shared true,共享；false,不共享
     */
    public BigString(String string, boolean shared) {
        bigChars = new BigChar[string.length()];
        if (shared) {
            BigCharFactory factory = BigCharFactory.getInstance();
            for (int i = 0; i < bigChars.length; i++) {
                bigChars[i] = factory.getBigChar(string.charAt(i));
            }
        } else {
            for (int i = 0; i < bigChars.length; i++) {
                bigChars[i] = new BigChar(string.charAt(i));
            }
        }
    }

    /**
     * 显示
     */
    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
