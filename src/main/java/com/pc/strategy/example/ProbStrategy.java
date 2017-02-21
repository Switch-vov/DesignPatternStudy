package com.pc.strategy.example;

import java.util.Random;

/**
 * Prob策略类
 * Created by Switch on 2017-02-20.
 */
public class ProbStrategy implements Strategy {
    private Random random;  // 随机
    private int prevHandValue;  // 上一把的手势值
    private int currentHandValue; // 这一把的手势值

    // 历史出拳概率数组
    // history[上一把的手势值][这一把的手势值] 表示赢的次数
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    /**
     * 构造方法，传入初始化随机seek
     *
     * @param seed 随机种子
     */
    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }


    @Override
    public Hand nextHand() {
        int randomValue = this.random.nextInt(this.getSum(this.currentHandValue));
        int handValue = 0;
        if (randomValue < this.history[this.currentHandValue][0]) {
            // 当随机数在0到剪刀赢的次数时，赋值为0
            handValue = 0;
        } else if (randomValue < this.history[this.currentHandValue][0] + this.history[this.currentHandValue][1]) {
            // 当随机数在剪刀赢的次数到石头赢得次数时，赋值为1
            handValue = 1;
        } else {
            // 其他情况，赋值为2
            handValue = 2;
        }
        // 当前值赋值为之前值
        this.prevHandValue = this.currentHandValue;
        // 计算出来的值赋值为当前值
        this.currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    /**
     * 获取history[上一把的手势值][三种手势]赢的总次数
     *
     * @param hv 上一把的手势值
     * @return history[上一把的手势值][三种手势]赢的总次数
     */
    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            // history[上一把的手势值][这一把的手势]赢的次数加一
            this.history[this.prevHandValue][this.currentHandValue]++;
        } else {
            // history[上一把的手势值][其他手势]赢的次数加一
            this.history[this.prevHandValue][(this.currentHandValue + 1) % 3]++;
            this.history[this.prevHandValue][(this.currentHandValue + 2) % 3]++;
        }
    }
}
