package com.pc.observer.example;

/**
 * 观察者接口
 * Created by Switch on 2017/3/30.
 */
public interface Observer {
    /**
     * 更新
     *
     * @param generator 数值生成器
     */
    void update(NumberGenerator generator);
}
