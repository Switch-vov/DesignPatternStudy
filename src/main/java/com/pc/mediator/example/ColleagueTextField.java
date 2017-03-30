package com.pc.mediator.example;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * 文本域成员类
 * Created by Switch on 2017/3/30.
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    /**
     * 中介者
     */
    private Mediator mediator;

    /**
     * 构造方法，设置文本和字数
     *
     * @param text       文本
     * @param wordNumber 字数
     */
    public ColleagueTextField(String text, int wordNumber) {
        super(text, wordNumber);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    /**
     * 当文字发生变化时通知Mediator
     *
     * @param e 文本事件
     */
    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
