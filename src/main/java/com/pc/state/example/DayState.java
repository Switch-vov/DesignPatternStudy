package com.pc.state.example;

/**
 * 白天状态类
 * Created by Switch on 2017/3/31.
 */
public class DayState implements State {
    /**
     * 唯一实例
     */
    private static DayState singleton = new DayState();

    /**
     * 私有化构造方法
     */
    private DayState() {

    }

    /**
     * 获取唯一实例
     *
     * @return 白天状态对象
     */
    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
