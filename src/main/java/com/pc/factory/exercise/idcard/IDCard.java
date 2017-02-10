package com.pc.factory.exercise.idcard;

import com.pc.factory.example.framework.Product;

/**
 * IDCard类（添加编号）
 * Created by Switch on 2017-02-10.
 */
public class IDCard extends Product {
    // 所有者
    private String owner;
    // 编号
    private int number;

    /**
     * 构造方法，需要提供所有者和编号<br/>
     * 这里有个优化，访问范围为包内，也就是说只能让IDCardFactory创建实例
     *
     * @param owner  所有者
     * @param number 编号
     */
    IDCard(String owner, int number) {
        System.out.println("制作" + owner + "(" + number + ")的ID卡。");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + number + ")的ID卡。");
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }
}
