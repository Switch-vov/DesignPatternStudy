package com.pc.facade.example.test;

import com.pc.facade.example.PageMaker;
import org.junit.Test;

/**
 * PageMaker Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class PageMakerTest {
    /**
     * 测试外观模式
     */
    @Test
    public void testPageMaker() {
        PageMaker.makeWelcomePage("switchvov@163.com", "welcome.html");
    }

}
