package com.pc.observer.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数值生成器抽象类
 * Created by Switch on 2017/3/30.
 */
public abstract class NumberGenerator {
    /**
     * 观察者列表
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer 观察者对象
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除指定观察者
     *
     * @param observer 观察者对象
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 向观察者列表中的所有观察者发送通知
     */
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer observer = it.next();
            observer.update(this);
        }
    }

    /**
     * 获取数值
     *
     * @return 数值
     */
    public abstract int getNumber();

    /**
     * 生成数值
     */
    public abstract void execute();
}
