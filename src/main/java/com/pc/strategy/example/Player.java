package com.pc.strategy.example;

/**
 * 玩家类
 * Created by Switch on 2017-02-20.
 */
public class Player {
    private String name; // 玩家名
    private Strategy strategy; // 策略对象
    private int wincount;   // 赢的次数
    private int losecount;  // 输出次数
    private int gamecount;  // 游戏总次数

    /**
     * 构造方法
     *
     * @param name     玩家名
     * @param strategy 策略对象
     */
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    /**
     * 策略决定下次要出的手势
     *
     * @return 手势对象
     */
    public Hand nextHand() {
        return this.strategy.nextHand();
    }

    /**
     * 赢
     */
    public void win() {
        this.strategy.study(true);
        this.wincount++;
        this.gamecount++;
    }

    /**
     * 输
     */
    public void lose() {
        this.strategy.study(false);
        this.losecount++;
        this.gamecount++;
    }

    /**
     * 平
     */
    public void even() {
        this.gamecount++;
    }

    @Override
    public String toString() {
        return "[" + this.name + ":" + this.gamecount + " games, " + this.wincount + " win, " + this.losecount + " lose]";
    }
}
