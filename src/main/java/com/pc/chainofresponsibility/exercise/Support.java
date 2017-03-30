package com.pc.chainofresponsibility.exercise;

import com.pc.chainofresponsibility.example.Trouble;

/**
 * 支持抽象类
 * Created by Switch on 2017/3/30.
 */
public abstract class Support {
    /**
     * 解决问题的实例名
     */
    private String name;
    /**
     * 要推卸给的对象
     */
    private Support next;

    /**
     * 构造方法，设置名字
     *
     * @param name 实例名
     */
    public Support(String name) {
        this.name = name;
    }

    /**
     * 设置要推卸给的对象
     *
     * @param next 要推卸给的对象
     * @return 要推卸给的对象
     */
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 解决问题的步骤
     *
     * @param trouble 问题
     */
    public final void support(Trouble trouble) {
        for (Support support = this; true; support = support.next) {
            if (support.resolve(trouble)) {
                support.done(trouble);
                break;
            } else if (support.next == null) {
                support.fail(trouble);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Support{ name='" + name + '\'' + '}';
    }

    /**
     * 解决问题的方法
     *
     * @param trouble 问题对象
     * @return 如果解决返回true, 否则false
     */
    protected abstract boolean resolve(Trouble trouble);

    /**
     * 解决
     *
     * @param trouble 问题
     */
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    /**
     * 未解决
     *
     * @param trouble 问题
     */
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

}
