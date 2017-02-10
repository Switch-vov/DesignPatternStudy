package com.pc.singleton.exercise.a.test;

import com.pc.singleton.exercise.a.TicketMaker;
import org.junit.Test;

/**
 * 测试售票器
 * Created by Switch on 2017-02-10.
 */
public class TicketMakerTest {
    @Test
    public void testTicketMaker() {
        System.out.println("Start...");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "：" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End...");
    }
}
