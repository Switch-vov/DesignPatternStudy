package com.pc.strategy.exercise.a;

import com.pc.strategy.example.Hand;
import com.pc.strategy.example.Strategy;

import java.util.Random;

/**
 * 随机策略类
 * Created by Switch on 2017-02-20.
 */
public class RandomStrategy implements Strategy {
    /**
     * 随机对象
     */
    private Random random;

    /**
     * 构造方法，传入初始化随机seek
     *
     * @param seed 随机种子
     */
    public RandomStrategy(int seed) {
        this.random = new Random(seed);
    }


    @Override
    public Hand nextHand() {
        return Hand.getHand(this.random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
