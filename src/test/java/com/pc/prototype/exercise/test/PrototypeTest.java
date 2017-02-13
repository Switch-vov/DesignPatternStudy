package com.pc.prototype.exercise.test;

import com.pc.prototype.exercise.concrete.product.MessageBox;
import com.pc.prototype.exercise.concrete.product.UnderlinePen;
import com.pc.prototype.exercise.framework.Manager;
import com.pc.prototype.exercise.framework.Product;
import org.junit.Test;

/**
 * 原型测试类
 * Created by Switch on 2017-02-13.
 */
public class PrototypeTest {
    @Test
    public void testPrototype() {
        // 创建管理器
        Manager manager = new Manager();
        // 下划线
        UnderlinePen underlinePen = new UnderlinePen('~');
        // 消息框
        MessageBox messageBox = new MessageBox('*');

        // 加入管理
        String underline = "underline";
        String box = "box";
        manager.register(underline, underlinePen);
        manager.register(box, messageBox);

        // 使用管理器创建克隆对象并使用
        Product underlineProduct = manager.create(underline);
        Product boxProduct = manager.create(box);

        String hello = "Hello World!";
        underlineProduct.use(hello);
        boxProduct.use(hello);
    }
}
