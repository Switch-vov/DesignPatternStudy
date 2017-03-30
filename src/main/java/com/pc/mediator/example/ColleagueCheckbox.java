package com.pc.mediator.example;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 复选框成员类
 * Created by Switch on 2017/3/30.
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    /**
     * 中介者
     */
    private Mediator mediator;

    /**
     * 构造方法，设置复选框标题、组、初始状态
     *
     * @param caption 标题
     * @param group   组
     * @param state   初始状态
     */
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    /**
     * 当状态发生变化时通知Mediator
     *
     * @param e 选项事件
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
