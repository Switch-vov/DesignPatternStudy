package com.pc.prototype.exercise.concrete.product;


import com.pc.prototype.exercise.framework.Product;

/**
 * 下划线类
 * Created by Switch on 2017-02-13.
 */
public class UnderlinePen extends Product {
    // 下划线字符
    private char ulchar;

    /**
     * 构造方法传入下划线字符
     *
     * @param ulchar 下划线字符
     */
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }


    @Override
    public void use(String s) {
        // 字符串字节长度
        int length = s.getBytes().length;

        // 输出字符串
        System.out.println("\"" + s + "\"");

        // 输出下划线
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(this.ulchar);
        }
        System.out.println();
    }
}
