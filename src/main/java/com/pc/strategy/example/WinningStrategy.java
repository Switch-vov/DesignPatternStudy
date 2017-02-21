package com.pc.strategy.example;

import java.util.Random;

/**
 * Winning策略类
 * Created by Switch on 2017-02-20.
 */
public class WinningStrategy implements Strategy {
    private Random random; // 随机
    private boolean won = false;    // 上一把是否赢了
    private Hand prevHand;  // 上一把的手势对象

    /**
     * 构造方法，传入初始化随机seek
     *
     * @param seed 随机种子
     */
    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!this.won) {
            this.prevHand = Hand.getHand(this.random.nextInt(3));
        }
        return this.prevHand;
    }

    @Override
    public void study(boolean win) {
        this.won = win;
    }
}
