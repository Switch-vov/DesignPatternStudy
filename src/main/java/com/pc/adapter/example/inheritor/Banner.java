package com.pc.adapter.example.inheritor;

/**
 * 旗帜类（实际情况）
 * Created by switch on 17/1/21.
 */
public class Banner {
    // 标语
    private String slogan;

    /**
     * 传入标语构造旗帜对象
     *
     * @param slogan 标语
     */
    public Banner(String slogan) {
        this.slogan = slogan;
    }

    /**
     * 弱化旗帜标语，并展示
     */
    public void showWithParen() {
        System.out.println("(" + slogan + ")");
    }

    /**
     * 强化旗帜标语，并展示
     */
    public void showWithAster() {
        System.out.println("*" + slogan + "*");
    }
}
