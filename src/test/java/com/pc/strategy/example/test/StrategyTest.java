package com.pc.strategy.example.test;

import com.pc.strategy.example.Hand;
import com.pc.strategy.example.Player;
import com.pc.strategy.example.ProbStrategy;
import com.pc.strategy.example.WinningStrategy;
import org.junit.Test;

/**
 * Strategy Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class StrategyTest {
    /**
     * 测试策略类
     */
    @Test
    public void testStrategy() {
        Player switchvov = new Player("switch", new WinningStrategy(31));
        Player kity = new Player("kity", new ProbStrategy(13));

        for (int i = 0; i < 10000; i++) {
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
