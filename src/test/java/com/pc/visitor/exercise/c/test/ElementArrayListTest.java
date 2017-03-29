package com.pc.visitor.exercise.c.test;

import com.pc.visitor.example.Directory;
import com.pc.visitor.example.File;
import com.pc.visitor.example.ListVisitor;
import com.pc.visitor.exercise.c.ElementArrayList;
import org.junit.Test;

/**
 * ElementArrayList Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class ElementArrayListTest {
    @Test
    public void testElementArrayList() throws Exception {
        Directory root1 = new Directory("root1");
        root1.add(new File("diary.html", 10));
        root1.add(new File("index.html", 20));

        Directory root2 = new Directory("root2");
        root2.add(new File("diary.html", 10));
        root2.add(new File("index.html", 20));

        ElementArrayList elementArrayList = new ElementArrayList();
        elementArrayList.add(root1);
        elementArrayList.add(root2);
        elementArrayList.add(new File("etc.html", 1234));

        elementArrayList.accept(new ListVisitor());
    }
}
