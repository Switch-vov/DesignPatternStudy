package com.pc.decorator.exercise.b.test;

import com.pc.decorator.example.Display;
import com.pc.decorator.example.FullBorder;
import com.pc.decorator.example.SideBorder;
import com.pc.decorator.exercise.a.UpDownBorder;
import com.pc.decorator.exercise.b.MultiStringDisplay;
import org.junit.Test;

/**
 * MultiStringDisplay Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class MultiStringDisplayTest {
    /**
     * 测试显示多行字符串
     */
    @Test
    public void testMultiStringDisplay() {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hi !");
        md.add("Hello !");
        md.add("Hello World !");
        md.show();

        Display display1 = new SideBorder(md, '|');
        Display display2 = new FullBorder(display1);
        Display display3 = new UpDownBorder(display2, '-');

        display1.show();
        display2.show();
        display3.show();
    }
}
