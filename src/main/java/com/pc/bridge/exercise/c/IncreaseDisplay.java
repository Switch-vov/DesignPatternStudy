package com.pc.bridge.exercise.c;

import com.pc.bridge.example.CountDisplay;
import com.pc.bridge.example.DisplayImpl;

/**
 * 逐步增加显示类
 * Created by Switch on 2017-02-19.
 */
public class IncreaseDisplay extends CountDisplay {
    // 逐步增加的步长
    private int step;


    /**
     * 构造方法，传入显示实现对象
     *
     * @param displayImpl 显示实现对象
     * @param step        步长
     */
    public IncreaseDisplay(DisplayImpl displayImpl, int step) {
        super(displayImpl);
        this.step = step;
    }

    /**
     * 逐步增加输出
     *
     * @param level 层数
     */
    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            this.multiDisplay(count);
            count += step;
        }
    }
}
