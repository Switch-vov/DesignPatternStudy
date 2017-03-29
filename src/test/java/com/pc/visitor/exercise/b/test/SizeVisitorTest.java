package com.pc.visitor.exercise.b.test;

import com.pc.visitor.exercise.b.Directory;
import com.pc.visitor.exercise.b.File;
import org.junit.Test;

/**
 * SizeVisitor Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class SizeVisitorTest {
    @Test
    public void testSizeVisitor() throws Exception {
        System.out.println("添加文件和文件夹：");
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(usrDir);

        binDir.add(new File("java", 5000));
        binDir.add(new File("javac", 10000));

        System.out.println(rootDir.getName() + "文件夹大小为：" + rootDir.getSize());

        System.out.println();
        System.out.println("接着添加文件和文件夹：");
        System.out.println("Making user entries...");
        Directory switchvov = new Directory("switchvov");
        Directory kity = new Directory("kity");
        Directory tom = new Directory("tom");
        Directory bob = new Directory("bob");

        usrDir.add(switchvov);
        usrDir.add(kity);
        usrDir.add(bob);

        switchvov.add(new File("readme.txt", 1000));
        switchvov.add(new File("hello.txt", 400));
        kity.add(new File("find.sh", 5000));

        System.out.println(usrDir.getName() + "文件夹大小为：" + usrDir.getSize());
    }
}
