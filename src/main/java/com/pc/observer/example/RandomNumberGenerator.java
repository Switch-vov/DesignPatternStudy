package com.pc.observer.example;

import java.util.Random;

/**
 * 随机数值生成器类
 * Created by Switch on 2017/3/30.
 */
public class RandomNumberGenerator extends NumberGenerator {
    /**
     * 随机数生成器
     */
    private Random random = new Random();

    /**
     * 当前数值
     */
    private int number;

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            this.notifyObservers();
        }
    }
}
