package com.pc.composite.example.test;

import com.pc.composite.example.Directory;
import com.pc.composite.example.File;
import com.pc.composite.example.FileTreatmentException;
import org.junit.Test;

/**
 * Entry Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class EntryTest {
    /**
     * 测试微型文件系统
     */
    @Test
    public void testEntry() {
        try {
            System.out.println("添加文件和文件夹：");
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory etcDir = new Directory("etc");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(etcDir);
            rootDir.add(usrDir);

            binDir.add(new File("java", 5000));
            binDir.add(new File("javac", 10000));

            rootDir.printList();

            System.out.println();
            System.out.println("接着添加文件和文件夹：");
            System.out.println("Making user entries...");
            Directory switchvov = new Directory("switchvov");
            Directory kity = new Directory("kity");
            Directory tom = new Directory("tom");
            Directory bob = new Directory("bob");

            usrDir.add(switchvov);
            usrDir.add(kity);
            usrDir.add(tom);
            usrDir.add(bob);

            switchvov.add(new File("readme.txt", 1000));
            switchvov.add(new File("hello.txt", 400));
            kity.add(new File("find.sh", 5000));
            tom.add(new File("rehash.sh", 4000));
            tom.add(new File("index.html", 15400));

            rootDir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
