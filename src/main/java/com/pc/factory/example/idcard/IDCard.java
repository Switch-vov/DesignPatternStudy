package com.pc.factory.example.idcard;

import com.pc.factory.example.framework.Product;

/**
 * IDCard类
 * Created by Switch on 2017-02-09.
 */
public class IDCard extends Product {
    // 所有者
    private String owner;

    /**
     * 构造方法，需要提供所有者<br/>
     * 这里有个优化，访问范围为包内，也就是说只能让IDCardFactory创建实例
     *
     * @param owner 所有者
     */
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    /**
     * 获取所有者
     *
     * @return 所有者
     */
    public String getOwner() {
        return this.owner;
    }
}
