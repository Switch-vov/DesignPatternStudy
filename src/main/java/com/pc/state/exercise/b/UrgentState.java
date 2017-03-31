package com.pc.state.exercise.b;

/**
 * Created by Switch on 2017/3/31.
 */
public class UrgentState implements State {
    /**
     * 唯一实例
     */
    private static UrgentState singleton = new UrgentState();

    /**
     * 私有化构造方法
     */
    private UrgentState() {
    }

    /**
     * 获取唯一实例
     *
     * @return 紧急状态对象
     */
    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // 什么都不做
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急:紧急时使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(紧急时)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(紧急时)");
    }

    @Override
    public String toString() {
        return "[紧急时]";
    }
}
