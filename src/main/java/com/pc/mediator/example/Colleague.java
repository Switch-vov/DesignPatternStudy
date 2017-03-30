package com.pc.mediator.example;

/**
 * 成员接口
 * Created by Switch on 2017/3/30.
 */
public interface Colleague {
    /**
     * 设置中介者
     *
     * @param mediator 中介者对象
     */
    void setMediator(Mediator mediator);

    /**
     * 设置成员状态
     *
     * @param enabled 启用true,不启用false
     */
    void setColleagueEnabled(boolean enabled);
}
