package com.pc.mediator.example;

/**
 * 中介者接口
 * Created by Switch on 2017/3/30.
 */
public interface Mediator {
    /**
     * 创建中介者管理成员
     */
    void createColleagues();

    /**
     * 成员状态改变
     */
    void colleagueChanged();

}
