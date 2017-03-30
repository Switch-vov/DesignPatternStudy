package com.pc.chainofresponsibility.exercise.test;

import com.pc.chainofresponsibility.example.Trouble;
import com.pc.chainofresponsibility.exercise.*;
import org.junit.Test;

/**
 * Support Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class SupportTest {
    /**
     * 测试责任链模式
     */
    @Test
    public void testSupport() {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        // 形成责任链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        // 制造各种问题
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
