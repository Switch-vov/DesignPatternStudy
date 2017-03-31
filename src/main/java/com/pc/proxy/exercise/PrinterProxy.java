package com.pc.proxy.exercise;

import com.pc.proxy.example.Printable;

/**
 * 打印代理类
 * Created by Switch on 2017/3/31.
 */
public class PrinterProxy implements Printable {
    /**
     * 名字
     */
    private String name;
    /**
     * 本人
     */
    private Printable real;

    /**
     * 类名
     */
    private String className;

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (this.real != null) {
            this.real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        this.realize();
        this.real.print(string);
    }

    /**
     * 生成本人
     */
    private synchronized void realize() {
        if (this.real == null) {
            try {
                this.real = (Printable) Class.forName(this.className).newInstance();
                real.setPrinterName(this.name);
            } catch (ClassNotFoundException e) {
                System.out.println("没有找到" + this.className + "类");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
