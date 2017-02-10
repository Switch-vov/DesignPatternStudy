package com.pc.factory.exercise.idcard;

import com.pc.factory.example.framework.Factory;
import com.pc.factory.example.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * IDCard工厂类
 * Created by Switch on 2017-02-09.
 */
public class IDCardFactory extends Factory {
    // ID卡所有者Map集合
    private Map<Integer, Product> owners = new HashMap<>();

    // 编号
    private int number = 10000;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, number++);
    }

    @Override
    protected void registerProduct(Product product) {
        this.owners.put(((IDCard) product).getNumber(), product);
    }

    /**
     * 获取ID卡所有者Map集合
     *
     * @return ID卡所有者Map集合
     */
    public Map<Integer, Product> getOwners() {
        return this.owners;
    }
}

