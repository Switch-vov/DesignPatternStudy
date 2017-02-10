package com.pc.factory.exercise.test;

import com.pc.factory.example.framework.Factory;
import com.pc.factory.example.framework.Product;
import com.pc.factory.exercise.idcard.IDCardFactory;
import org.junit.Test;

import java.util.Map;

/**
 * ID卡工厂测试类
 * Created by Switch on 2017-02-10.
 */
public class IDCardFactoryTest {
    @Test
    public void testIDCard() {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("Switch");
        Product product2 = factory.create("Kity");
        Product product3 = factory.create("Tom");
        product1.use();
        product2.use();
        product3.use();

        // 扩展使用
        IDCardFactory idCardFactory = (IDCardFactory) factory;
        Map<Integer, Product> owners = idCardFactory.getOwners();
        for (Map.Entry<Integer, Product> entryOwners : owners.entrySet()) {
            System.out.println(entryOwners.getKey() + ":" + entryOwners.getValue());
        }
    }
}
