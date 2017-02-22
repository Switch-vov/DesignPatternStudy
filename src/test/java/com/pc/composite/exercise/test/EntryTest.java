package com.pc.composite.exercise.test;

import com.pc.composite.exercise.Directory;
import com.pc.composite.exercise.File;
import com.pc.composite.exercise.FileTreatmentException;
import org.junit.Test;

/**
 * Entry Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class EntryTest {

    /**
     * 测试
     */
    @Test
    public void testEntry() {
        try {
            System.out.println("添加文件和文件夹：");
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory usrDir = new Directory("usr");

            rootDir.add(usrDir);

            Directory switchvov = new Directory("switchvov");
            Directory kity = new Directory("kity");

            usrDir.add(switchvov);
            usrDir.add(kity);

            File readMe = new File("readme.txt", 1000);
            switchvov.add(readMe);
            switchvov.add(new File("hello.txt", 400));
            kity.add(new File("find.sh", 5000));

            rootDir.printList();

            System.out.println();
            System.out.println("switchvov的全路径是：" + switchvov.getFullName());
            System.out.println("kity的全路径是：" + kity.getFullName());
            System.out.println("readMe的全路径是：" + readMe.getFullName());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
