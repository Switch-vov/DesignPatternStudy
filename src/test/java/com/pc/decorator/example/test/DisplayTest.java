package com.pc.decorator.example.test;

import com.pc.decorator.example.Display;
import com.pc.decorator.example.FullBorder;
import com.pc.decorator.example.SideBorder;
import com.pc.decorator.example.StringDisplay;
import org.junit.Test;

/**
 * Display Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class DisplayTest {
    /**
     * 测试装饰模式
     */
    @Test
    public void testDisplay() {
        Display display1 = new StringDisplay("Hello World!");
        Display display2 = new SideBorder(display1, '#');
        Display display3 = new FullBorder(display2);

        display1.show();
        display2.show();
        display3.show();

        System.out.println();

        Display display4 = new FullBorder(new SideBorder(new FullBorder(new StringDisplay("Hello")), '#'));
        display4.show();
    }
}
