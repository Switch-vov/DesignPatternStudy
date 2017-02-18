package com.pc.abstractfactory.exercise.test;

import com.pc.abstractfactory.example.factory.Page;
import com.pc.abstractfactory.exercise.Factory;
import org.junit.Test;

/**
 * Factory Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class FactoryTest {
    @Test
    public void testFactory() {
        Factory factory = Factory.getFactory("com.pc.abstractfactory.exercise.ListFactory");
        Page yahho = factory.createYahho();
        yahho.output();
    }
}
