package com.pc.proxy.example.test;

import com.pc.proxy.example.Printable;
import com.pc.proxy.example.PrinterProxy;
import org.junit.Test;

/**
 * PrinterProxy Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class ProxyTest {

    /**
     * 测试代理模式
     */
    @Test
    public void testProxy() {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, World.");
    }

} 
