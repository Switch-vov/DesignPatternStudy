package com.pc.adapter.example.delegation;

/**
 * 打印旗帜信息（转换装置）
 * Created by switch on 17/1/21.
 */
public class PrintBanner extends Print {
    // 旗帜对象
    private Banner banner;

    public PrintBanner(String slogan) {
        banner = new Banner(slogan);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
