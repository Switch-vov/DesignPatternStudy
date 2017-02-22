package com.pc.decorator.exercise.a.test;

import com.pc.decorator.example.Display;
import com.pc.decorator.example.FullBorder;
import com.pc.decorator.example.SideBorder;
import com.pc.decorator.example.StringDisplay;
import com.pc.decorator.exercise.a.UpDownBorder;
import org.junit.Test;

/**
 * UpDownBorder Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class UpDownBorderTest {

    /**
     * 测试上下边框装饰类
     */
    @Test
    public void testUpDownBorder() {
        Display display1 = new StringDisplay("Hello World!");
        Display display2 = new UpDownBorder(display1, '-');

        display1.show();
        display2.show();

        System.out.println();

        Display display4 = new UpDownBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("Hello")), '#')), '*');
        display4.show();
    }
}
