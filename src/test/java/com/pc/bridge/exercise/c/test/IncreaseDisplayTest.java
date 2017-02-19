package com.pc.bridge.exercise.c.test;

import com.pc.bridge.exercise.c.CharDiplayImpl;
import com.pc.bridge.exercise.c.IncreaseDisplay;
import org.junit.Test;

/**
 * IncreaseDisplay Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class IncreaseDisplayTest {
    @Test
    public void testIncreaseDisplay() throws Exception {
        IncreaseDisplay increaseDisplay1 = new IncreaseDisplay(new CharDiplayImpl('<', '*', '>'), 1);
        increaseDisplay1.increaseDisplay(5);

        System.out.println();

        IncreaseDisplay increaseDisplay2 = new IncreaseDisplay(new CharDiplayImpl('|', '#', '-'), 2);
        increaseDisplay2.increaseDisplay(5);
    }
}
