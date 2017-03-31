package com.pc.flyweight.exercise.a.test;

import com.pc.flyweight.exercise.a.BigString;
import org.junit.Test;

/**
 * BigString Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class BigStringTest {
    /**
     * 测试共享和不共享
     */
    @Test
    public void testBigString() {
        BigString string1 = new BigString("1-3", true);
        string1.print();
        BigString string2 = new BigString("4-6", false);
        string2.print();
    }
}
