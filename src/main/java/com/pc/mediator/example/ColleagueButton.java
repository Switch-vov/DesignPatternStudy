package com.pc.mediator.example;

import java.awt.Button;

/**
 * 按钮成员类
 * Created by Switch on 2017/3/30.
 */
public class ColleagueButton extends Button implements Colleague {
    /**
     * 中介者
     */
    private Mediator mediator;

    /**
     * 构造方法，设置标题
     *
     * @param caption 标题
     */
    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
