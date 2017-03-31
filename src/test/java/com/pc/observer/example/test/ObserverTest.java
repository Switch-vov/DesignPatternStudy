package com.pc.observer.example.test;

import com.pc.observer.example.*;
import org.junit.Test;

/**
 * DigitObserver Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class ObserverTest {
    /**
     * 测试观察者模式
     */
    @Test
    public void testObserver() {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
