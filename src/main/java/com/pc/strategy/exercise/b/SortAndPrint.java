package com.pc.strategy.exercise.b;

/**
 * 排序和打印类
 * Created by Switch on 2017-02-21.
 */
public class SortAndPrint {
    /**
     * 待排序的数据
     */
    private Comparable[] data;
    /**
     * 排序算法
     */
    private Sorter sorter;

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    /**
     * 执行排序
     */
    public void execute() {
        print();
        sorter.sort(data);
        print();
    }

    /**
     * 打印数据
     */
    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println();
    }

}
