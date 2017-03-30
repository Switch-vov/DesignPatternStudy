package com.pc.mediator.example.test;

import com.pc.mediator.example.LoginFrame;
import org.junit.Test;

/**
 * LoginFrame Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class LoginFrameTest {
    /**
     * 测试中介者模式
     *
     * @throws InterruptedException 中断异常
     */
    @Test
    public void testLoginFrame() throws InterruptedException {
        new LoginFrame("Mediator Sample");
        Thread.sleep(100000);
    }

}
