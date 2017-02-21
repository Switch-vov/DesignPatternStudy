package com.pc.strategy.example;

/**
 * 猜拳策略接口
 * Created by Switch on 2017-02-20.
 */
public interface Strategy {
    /**
     * 下一个出拳手势
     *
     * @return 手势实例
     */
    Hand nextHand();

    /**
     * 根据上一次猜拳是否获胜，决定下一次的猜拳手势
     *
     * @param win 是否获胜
     */
    void study(boolean win);
}
