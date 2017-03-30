package com.pc.facade.exercise.test;

import com.pc.facade.exercise.PageMaker;
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
        PageMaker.makeLinkPage("linkpage.html");
    }

}
