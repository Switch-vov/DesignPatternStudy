package com.pc.bridge.exercise.a.test;

import com.pc.bridge.example.StringDisplayImpl;
import com.pc.bridge.exercise.a.RandomCountDisplay;
import org.junit.Test;

/**
 * RandomCountDisplay Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class RandomCountDisplayTest {
    @Test
    public void testRandomCountDisplay() throws Exception {
        RandomCountDisplay randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("Hello World!"));
        randomCountDisplay.randomDisplay(10);
    }
}
