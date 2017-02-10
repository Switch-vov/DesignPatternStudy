package com.pc.factory.example.framework;

/**
 * 工厂类
 * Created by Switch on 2017-02-09.
 */
public abstract class Factory {
    /**
     * 创建产品
     *
     * @param owner 所有者
     * @return 产品
     */
    public final Product create(String owner) {
        // 创建产品
        Product product = this.createProduct(owner);
        // 注册产品
        this.registerProduct(product);
        return product;
    }

    /**
     * 创建产品
     *
     * @param owner 所有者
     * @return 产品
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     *
     * @param product 产品
     */
    protected abstract void registerProduct(Product product);
}
