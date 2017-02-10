package com.pc.singleton.example.test;

import com.pc.singleton.example.SingleTonLazy;
import com.pc.singleton.example.Singleton;
import com.pc.singleton.example.SingletonEnum;
import org.junit.Test;

import java.util.List;

/**
 * 单例模式测试类
 * Created by Switch on 2017-02-10.
 */
public class SingletonTest {
    @Test
    public void testSingleton() {
        System.out.println("饿汉式...");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("s1与s2是一个对象");
        } else {
            System.out.println("s1与s2不是一个对象");
        }
    }

    @Test
    public void testSingletonLazy() {
        System.out.println("懒汉式...");
        SingleTonLazy s1 = SingleTonLazy.getInstance();
        SingleTonLazy s2 = SingleTonLazy.getInstance();
        if (s1 == s2) {
            System.out.println("s1与s2是一个对象");
        } else {
            System.out.println("s1与s2不是一个对象");
        }
    }

    @Test
    public void testSingletonEnum() {
        System.out.println("懒汉式...");
        SingletonEnum s1 = SingletonEnum.instance;
        SingletonEnum s2 = SingletonEnum.instance;

        if (s1 == s2) {
            System.out.println("s1与s2是一个对象");
        } else {
            System.out.println("s1与s2不是一个对象");
        }
        
        List<String> list = SingletonEnum.instance.buildlList();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
