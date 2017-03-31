package com.pc.state.exercise.a;

/**
 * 状态接口
 * Created by Switch on 2017/3/31.
 */
public interface State {
    /**
     * 设置时间
     *
     * @param context 背景对象
     * @param hour    时间
     */
    void doClock(Context context, int hour);

    /**
     * 使用金库
     *
     * @param context 背景对象
     */
    void doUse(Context context);

    /**
     * 按下警铃
     *
     * @param context 背景对象
     */
    void doAlarm(Context context);

    /**
     * 正常通话
     *
     * @param context 背景对象
     */
    void doPhone(Context context);
}
