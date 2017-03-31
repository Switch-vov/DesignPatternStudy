package com.pc.state.exercise.a.test;

import com.pc.state.exercise.a.SafeFrame;
import org.junit.Test;

/**
 * NoonState Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class NoonStateTest {
    /**
     * 测试午餐状态类
     */
    @Test
    public void testNoonState() {
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
