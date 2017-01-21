package com.pc.adapter.example.inheritor;

/**
 * 打印旗帜信息（转换装置）
 * Created by switch on 17/1/21.
 */
public class PrintBanner extends Banner implements Print {
    /**
     * 传入标语构造旗帜对象
     *
     * @param slogan 标语
     */
    public PrintBanner(String slogan) {
        super(slogan);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
