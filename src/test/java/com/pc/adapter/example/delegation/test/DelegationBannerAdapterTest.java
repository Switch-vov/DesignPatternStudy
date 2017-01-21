package com.pc.adapter.example.delegation.test;


import com.pc.adapter.example.delegation.Print;
import com.pc.adapter.example.delegation.PrintBanner;
import org.junit.Test;

/**
 * 旗帜适配器测试——适配器采用对象适配器模式
 * 也就是基于委托的适配器模式
 * Created by switch on 17/1/21.
 */
public class DelegationBannerAdapterTest {
    @Test
    public void testInheritorBannerAdapter() {
        Print print = new PrintBanner("我们的口号是，没有蛀牙！");
        print.printWeak();
        print.printStrong();
    }
}
