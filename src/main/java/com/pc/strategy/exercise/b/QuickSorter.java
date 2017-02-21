package com.pc.strategy.exercise.b;

/**
 * 快速排序
 * Created by Switch on 2017-02-21.
 */
public class QuickSorter implements Sorter {
    /**
     * 待排序数组
     */
    private Comparable[] data;

    @Override
    public void sort(Comparable[] data) {
        this.data = data;
        this.quickSort(0, data.length - 1);
    }

    /**
     * 快速排序
     *
     * @param begin 开始索引
     * @param end   结束索引
     */
    public void quickSort(int begin, int end) {
        // 计算一个标兵，这里取中值
        Comparable centerValue = this.data[(begin + end) / 2];
        int bSaved = begin;
        int eSaved = end;
        while (begin <= end) {
            // 由前往后面遍历，找到一个大于标兵值的
            while (this.data[begin].compareTo(centerValue) < 0) {
                begin++;
            }
            // 由后往前面遍历，找到小于标兵值的
            while (this.data[end].compareTo(centerValue) > 0) {
                end--;
            }
            if (begin <= end) {
                // 交换
                Comparable temp = this.data[begin];
                this.data[begin] = this.data[end];
                this.data[end] = temp;
                // 索引
                begin++;
                end--;
            }
        }

        if (bSaved < end) {
            this.quickSort(bSaved, end);
        }
        if (eSaved > begin) {
            this.quickSort(begin, eSaved);
        }
    }
}
