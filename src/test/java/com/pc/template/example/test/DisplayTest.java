package com.pc.template.example.test;

import com.pc.template.example.AbstractDisplay;
import com.pc.template.example.CharDisplay;
import com.pc.template.example.StringDisplay;
import org.junit.Test;

/**
 * 显示测试类
 * Created by Switch on 2017-02-04.
 */
public class DisplayTest {
    @Test
    public void testDisplay() {
        AbstractDisplay display1 = new CharDisplay('s');
        AbstractDisplay display2 = new StringDisplay("Switch");
        AbstractDisplay display3 = new StringDisplay("交换机");
        display1.display();
        display2.display();
        display3.display();
    }
}
