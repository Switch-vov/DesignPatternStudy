package com.pc.bridge.exercise.a;

import com.pc.bridge.example.CountDisplay;
import com.pc.bridge.example.DisplayImpl;

import java.util.Random;

/**
 * 随机打印类
 * Created by Switch on 2017-02-19.
 */
public class RandomCountDisplay extends CountDisplay {
    /**
     * 构造方法，传入显示实现对象
     *
     * @param displayImpl 显示实现对象
     */
    public RandomCountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    /**
     * 随机打印若干次
     *
     * @param times 次数上限
     */
    public void randomDisplay(int times) {
        Random random = new Random();
        this.multiDisplay(random.nextInt(times));
    }
}
