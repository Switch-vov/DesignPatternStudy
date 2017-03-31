package com.pc.memento.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 游戏者类
 * Created by Switch on 2017/3/31.
 */
public class Gamer {
    /**
     * 所持金钱
     */
    private int money;
    /**
     * 获得的水果
     */
    private List<String> fruits = new ArrayList<>();
    /**
     * 随机数生成器
     */
    private Random random = new Random();
    /**
     * 表示水果种类的数组
     */
    private static String[] fruitsname = {"苹果", "葡萄", "香蕉", "橘子"};

    /**
     * 构造方法，初始化金钱数
     *
     * @param money 金钱数
     */
    public Gamer(int money) {
        this.money = money;
    }

    /**
     * 获取当前所持金钱数
     *
     * @return 金钱数
     */
    public int getMoney() {
        return money;
    }

    /**
     * 投掷骰子进行游戏
     */
    public void bet() {
        // 获取骰子数值
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            this.money += 100;
            System.out.println("所持金钱增加了。");
        } else if (dice == 2) {
            this.money /= 2;
            System.out.println("所持金钱减半了。");
        } else if (dice == 6) {
            String f = this.getFruit();
            System.out.println("获得了水果(" + f + ")。");
            this.fruits.add(f);
        } else {
            System.out.println("什么都没有发生。");
        }
    }

    /**
     * 创建备忘录
     *
     * @return 备忘录对象
     */
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            if (fruit.startsWith("好吃的")) {
                m.addFruit(fruit);
            }
        }
        return m;
    }

    /**
     * 撤销到指定备忘
     *
     * @param memento 备忘录对象
     */
    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    /**
     * 获得一个水果
     *
     * @return 水果
     */
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    @Override
    public String toString() {
        return "Gamer{ money=" + money + ", fruits=" + fruits + '}';
    }
}
