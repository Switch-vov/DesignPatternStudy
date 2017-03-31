package com.pc.flyweight.exercise.b.test;

import com.pc.flyweight.exercise.b.BigString;
import org.junit.Test;

/**
 * BigString Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class BigStringTest {
    private static BigString[] bsarray = new BigString[10000];

    /**
     * 比较共享和不共享，内存使用量
     */
    @Test
    public void testBigString() {
        System.out.println("共享时:");
        testAllocation(true);
        System.out.println("非共享时:");
        testAllocation(false);
    }

    public static void testAllocation(boolean shared) {
        for (int i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString("1212123", shared);
        }
        showMemory();
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用内存 = " + used);
    }
}
