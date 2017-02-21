package com.pc.strategy.example;

/**
 * 猜拳手势类
 * Created by Switch on 2017-02-20.
 */
public class Hand {
    private static final int HANDVALUE_ST = 0;  // 石头
    private static final int HANDVALUE_JD = 1;  // 剪刀
    private static final int HANDVALUE_BU = 2;  // 布

    private int handValue;  // 手势值

    // 手势值对应的手势名
    private static final String[] name = {
            "石头", "剪刀", "布"
    };

    // 手势实例
    public static final Hand[] hand = {
            new Hand(HANDVALUE_ST),
            new Hand(HANDVALUE_JD),
            new Hand(HANDVALUE_BU)
    };

    /**
     * 构造方法，私有化，不能new出实例，注册表单例模式
     *
     * @param handValue 手势值
     */
    private Hand(int handValue) {
        this.handValue = handValue;
    }

    /**
     * 根据手势值，获取手势实例
     *
     * @param handValue 手势值
     * @return 手势实例
     */
    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    /**
     * 赢了返回true
     *
     * @param hand 手势实例
     * @return
     */
    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    /**
     * 输了返回true
     *
     * @param hand 手势实例
     * @return
     */
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    /**
     * 比较
     *
     * @param hand 手势实例
     * @return
     */
    private int fight(Hand hand) {
        if (this.handValue == hand.handValue) {
            return 0;   // 平
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;   // 胜
        } else {
            return -1;  // 负
        }
    }

    @Override
    public String toString() {
        // 手势值对应的手势名
        return name[this.handValue];
    }
}
