package com.pc.prototype.exercise.concrete.product;


import com.pc.prototype.exercise.framework.Product;

/**
 * 消息框类
 * Created by Switch on 2017-02-13.
 */
public class MessageBox extends Product {
    // 装饰字符
    private char decochar;

    /**
     * 构造方法传入装饰字符
     *
     * @param decochar 装饰字符
     */
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        // 获取字符串字节长度
        int length = s.getBytes().length;
        // 输出上边框
        this.outputBorder(length);

        // 输出消息
        System.out.println(this.decochar + " " + s + " " + this.decochar);

        // 输出下边框
        this.outputBorder(length);
    }

    /**
     * 输出边框
     *
     * @param length 字符串字节长度
     */
    private void outputBorder(int length) {
        for (int i = 0; i < length + 4; i++) {
            System.out.print(this.decochar);
        }
        System.out.println();
    }
}
