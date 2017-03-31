package com.pc.state.exercise.a;

/**
 * 晚上状态类
 * Created by Switch on 2017/3/31.
 */
public class NightState implements State {
    /**
     * 唯一实例
     */
    private static NightState singleton = new NightState();

    /**
     * 私有化构造方法
     */
    public NightState() {

    }

    /**
     * 获取唯一实例
     *
     * @return 晚上状态对象
     */
    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        } else if (12 <= hour && hour < 13) {
            context.changeState(NoonState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
