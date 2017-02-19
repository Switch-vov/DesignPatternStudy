package com.pc.bridge.example.test;

import com.pc.bridge.example.CountDisplay;
import com.pc.bridge.example.Display;
import com.pc.bridge.example.StringDisplayImpl;
import org.junit.Test;

/**
 * Display Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class DisplayTest {
    @Test
    public void testDisplay() throws Exception {
        Display display1 = new Display(new StringDisplayImpl("Hello World!"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello Java!"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello Design!"));

        display1.display();
        System.out.println();

        display2.display();
        System.out.println();

        display3.display();
        System.out.println();

        display3.multiDisplay(3);
    }
}
