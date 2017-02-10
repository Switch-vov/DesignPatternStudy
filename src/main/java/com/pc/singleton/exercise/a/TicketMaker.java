package com.pc.singleton.exercise.a;

/**
 * 售票器
 * Created by Switch on 2017-02-10.
 */
public class TicketMaker {
    // 票的编号
    private int ticket = 1000;

    private static TicketMaker instance = new TicketMaker();

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        return instance;
    }

    /**
     * 获取下一张票的编号
     *
     * @return 编号
     */
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
