package com.pc.state.exercise.b.test;

import com.pc.state.exercise.b.SafeFrame;
import org.junit.Test;

/**
 * UrgentState Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class UrgentStateTest {
    /**
     * 测试紧急状态类
     */
    @Test
    public void testUrgentState() {
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
