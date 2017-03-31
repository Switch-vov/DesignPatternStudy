package com.pc.observer.exercise.b.test;

import com.pc.observer.example.*;
import com.pc.observer.exercise.b.FrameObserver;
import org.junit.Test;

/**
 * FrameObserver Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class FrameObserverTest {
    /**
     * 测试图形观察者
     */
    @Test
    public void testFrameObserver() {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new FrameObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
}
