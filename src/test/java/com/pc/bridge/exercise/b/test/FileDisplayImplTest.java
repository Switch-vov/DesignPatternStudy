package com.pc.bridge.exercise.b.test;

import com.pc.bridge.example.CountDisplay;
import com.pc.bridge.exercise.b.FileDisplayImpl;
import org.junit.Test;

/**
 * FileDisplayImpl Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class FileDisplayImplTest {
    @Test
    public void testFileDisplayImpl() throws Exception {
        CountDisplay countDisplay = new CountDisplay(new FileDisplayImpl("E:\\info.txt"));
        countDisplay.multiDisplay(3);
    }
}
