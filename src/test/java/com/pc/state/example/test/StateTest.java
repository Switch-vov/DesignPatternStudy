package com.pc.state.example.test;

import com.pc.state.example.SafeFrame;
import org.junit.Test;

/**
 * NightState Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class StateTest {
    /**
     * 测试状态模式
     */
    @Test
    public void testState() {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
