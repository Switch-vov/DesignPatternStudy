package com.pc.proxy.example;

/**
 * 打印类
 * Created by Switch on 2017/3/31.
 */
public class Printer implements Printable {
    /**
     * 名字
     */
    private String name;

    public Printer() {
        this.heavyJob("正在生成Printer的实例");
    }

    public Printer(String name) {
        this.name = name;
        this.heavyJob("正在生成Printer的实例(" + this.name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("===" + this.name + "===");
        System.out.println(string);
    }

    /**
     * 工作
     *
     * @param msg 消息
     */
    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("结束。");
    }
}
