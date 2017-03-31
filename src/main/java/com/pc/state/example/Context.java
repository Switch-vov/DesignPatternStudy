package com.pc.state.example;

/**
 * 背景接口
 * Created by Switch on 2017/3/31.
 */
public interface Context {
    /**
     * 设置时间
     *
     * @param hour 时间
     */
    void setClock(int hour);

    /**
     * 改变状态
     *
     * @param state 状态
     */
    void changeState(State state);

    /**
     * 联系警报中心
     *
     * @param msg 消息
     */
    void callSecurityCenter(String msg);

    /**
     * 在警报中心留下记录
     *
     * @param msg 消息
     */
    void recordLog(String msg);
}
