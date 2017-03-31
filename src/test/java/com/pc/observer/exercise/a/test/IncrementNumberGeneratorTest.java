package com.pc.observer.exercise.a.test;

import com.pc.observer.example.DigitObserver;
import com.pc.observer.example.GraphObserver;
import com.pc.observer.example.NumberGenerator;
import com.pc.observer.example.Observer;
import com.pc.observer.exercise.a.IncrementNumberGenerator;
import org.junit.Test;

/**
 * IncrementNumberGenerator Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class IncrementNumberGeneratorTest {
    /**
     * 测试自增数值生成器
     */
    @Test
    public void testIncrementNumberGenerator() {
        NumberGenerator generator = new IncrementNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
