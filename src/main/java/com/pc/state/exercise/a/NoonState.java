package com.pc.state.exercise.a;

/**
 * 午餐状态类
 * Created by Switch on 2017/3/31.
 */
public class NoonState implements State {
    /**
     * 唯一实例
     */
    private static NoonState singleton = new NoonState();

    /**
     * 私有化构造方法
     */
    private NoonState() {

    }

    /**
     * 获取唯一实例
     *
     * @return 午餐状态对象
     */
    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急：午餐时间使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(午餐时间)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("午餐时间的通话录音");
    }

    @Override
    public String toString() {
        return "[午餐时间]";
    }
}
