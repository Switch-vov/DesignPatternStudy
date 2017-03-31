package com.pc.flyweight.example;

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
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
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
