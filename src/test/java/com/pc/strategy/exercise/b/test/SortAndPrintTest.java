package com.pc.strategy.exercise.b.test;

import com.pc.strategy.exercise.b.QuickSorter;
import com.pc.strategy.exercise.b.SelectionSorter;
import com.pc.strategy.exercise.b.SortAndPrint;
import org.junit.Test;

/**
 * SortAndPrint Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class SortAndPrintTest {

    /**
     * 测试排序
     */
    @Test
    public void testSortAndPrint() {
        String[] data1 = {"Switch", "Kity", "Tom", "Bob"};
        SortAndPrint sortAndPrint1 = new SortAndPrint(data1, new SelectionSorter());

        System.out.println("选择排序：");
        sortAndPrint1.execute();

        String[] data2 = {"Switch", "Kity", "Tom", "Bob"};
        System.out.println("快速排序：");
        SortAndPrint sortAndPrint2 = new SortAndPrint(data2, new QuickSorter());
        sortAndPrint2.execute();
    }

}
