package com.pc.adapter.example.delegation;

/**
 * 打印类（需求）
 * Created by switch on 17/1/21.
 */
public abstract class Print {
    /**
     * 打印弱化的字符串
     */
    public abstract void printWeak();

    /**
     * 打印强化的字符串
     */
    public abstract void printStrong();
}
