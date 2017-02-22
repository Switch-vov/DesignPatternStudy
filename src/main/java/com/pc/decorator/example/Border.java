package com.pc.decorator.example;

/**
 * 边框装饰抽象类
 * Created by Switch on 2017-02-21.
 */
public abstract class Border extends Display {
    /**
     * 待装饰的对象
     */
    protected Display display;

    /**
     * 构造方法，传入待装饰的显示类对象
     *
     * @param display 显示类对象
     */
    public Border(Display display) {
        this.display = display;
    }
}
