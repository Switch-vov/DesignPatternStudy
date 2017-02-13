package com.pc.prototype.example.framwork;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理类
 * Created by Switch on 2017-02-13.
 */
public class Manager {
    // 注册中心，管理Product接口实现类的原型
    private Map<String, Product> products = new HashMap<>();

    /**
     * 注册原型
     *
     * @param protoName 原型名称
     * @param product   原型类对象
     */
    public void register(String protoName, Product product) {
        products.put(protoName, product);
    }

    /**
     * 使用原型创造对象
     *
     * @param protoName 原型注册名称
     * @return 原型注册名称对应对象的clone对象
     */
    public Product create(String protoName) {
        Product product = this.products.get(protoName);
        return product.createClone();
    }

}
