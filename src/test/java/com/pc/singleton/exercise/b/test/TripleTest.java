package com.pc.singleton.exercise.b.test;

import com.pc.singleton.exercise.b.Triple;
import org.junit.Test;

/**
 * 测试登记式单例
 * Created by Switch on 2017-02-10.
 */
public class TripleTest {
    @Test
    public void testTriple() {
        System.out.println("Start...");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "：" + Triple.getInstance(i % 3));
        }

        System.out.println("End...");
    }
}
