package com.pc.proxy.exercise.test;

import com.pc.proxy.exercise.PrinterProxy;
import org.junit.Test;

/**
 * PrinterProxy Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class PrinterProxyTest {
    /**
     * 测试反射代理
     */
    @Test
    public void testPrinterProxy() {
        PrinterProxy proxy = new PrinterProxy("Switch", "com.pc.proxy.example.Printer");
        proxy.print("Hello, world");
    }
} 
