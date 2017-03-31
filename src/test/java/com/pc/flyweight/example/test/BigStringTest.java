package com.pc.flyweight.example.test;

import com.pc.flyweight.example.BigString;
import org.junit.Test;

/**
 * BigString Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class BigStringTest {
    /**
     * 测试享元模式
     */
    @Test
    public void testBigString() {
        BigString bigString = new BigString("123-456.");
        bigString.print();
    }
}
