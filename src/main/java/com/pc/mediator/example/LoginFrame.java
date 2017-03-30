package com.pc.mediator.example;

import java.awt.Frame;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 登录界面类
 * Created by Switch on 2017/3/30.
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
    /**
     * 复选框：访客
     */
    private ColleagueCheckbox checkGuest;
    /**
     * 复选框：用户
     */
    private ColleagueCheckbox checkLogin;
    /**
     * 文本域：用户名
     */
    private ColleagueTextField textUser;
    /**
     * 文本域：密码
     */
    private ColleagueTextField textPass;
    /**
     * 按钮：确定
     */
    private ColleagueButton buttonOk;
    /**
     * 按钮：取消
     */
    private ColleagueButton buttonCancel;

    /**
     * 构造方法，设置标题
     *
     * @param title 标题
     */
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // 使用布局管理器生成4×2窗格
        setLayout(new GridLayout(4, 2));
        // 生成各个Colleague
        createColleagues();
        // 配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        // 设置初始的启用起用/禁用状态
        colleagueChanged();
        // 显示
        pack();
        show();
    }

    @Override
    public void createColleagues() {
        // 生成
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        // 设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        // 设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) { // Guest mode
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else { // Login mode
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    /**
     * 当textUser或是textPass文本输入框中的文字发生变化时
     * 判断各Colleage的启用/禁用状态
     */
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
