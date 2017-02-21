package com.pc.strategy.exercise.a.test;

import com.pc.strategy.example.Hand;
import com.pc.strategy.example.Player;
import com.pc.strategy.example.ProbStrategy;
import com.pc.strategy.example.WinningStrategy;
import com.pc.strategy.exercise.a.RandomStrategy;
import org.junit.Test;

/**
 * RandomStrategy Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class RandomStrategyTest {

    /**
     * 测试随机策略
     */
    @Test
    public void testRandomStrategy() {
        Player switchvov = new Player("switch", new RandomStrategy(31));
        Player kity = new Player("kity", new ProbStrategy(141));

        for (int i = 0; i < 100000; i++) {
            Hand nextValue1 = switchvov.nextHand();
            Hand nextValue2 = kity.nextHand();
            if (nextValue1.isStrongerThan(nextValue2)) {
                switchvov.win();
                kity.lose();
                System.out.println("Winner:" + switchvov);
            } else if (nextValue1.isWeakerThan(nextValue2)) {
                switchvov.lose();
                kity.win();
                System.out.println("Winner:" + kity);
            } else {
                System.out.println("Even...");
                switchvov.even();
                kity.even();
            }
        }
        System.out.println("Total Result:");
        System.out.println(switchvov);
        System.out.println(kity);
    }


}
