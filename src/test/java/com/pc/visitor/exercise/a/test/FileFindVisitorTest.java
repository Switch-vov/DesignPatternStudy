package com.pc.visitor.exercise.a.test;

import com.pc.visitor.example.Directory;
import com.pc.visitor.example.File;
import com.pc.visitor.example.FileTreatmentException;
import com.pc.visitor.example.ListVisitor;
import com.pc.visitor.exercise.a.FileFindVisitor;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Iterator;

/**
 * FileFindVisitor Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class FileFindVisitorTest {

    @Test
    public void testFileFindVisitor() throws Exception {
        try {
            System.out.println("添加文件和文件夹：");
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(usrDir);

            binDir.add(new File("java", 5000));
            binDir.add(new File("javac", 10000));

            FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");
            rootDir.accept(fileFindVisitor);
            System.out.println("HTML files are:");
            Iterator<File> fileIterator = fileFindVisitor.getFoundFiles();
            while (fileIterator.hasNext()) {
                File file = fileIterator.next();
                System.out.println(file);
            }

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

            switchvov.add(new File("readme.html", 1000));
            switchvov.add(new File("hello.txt", 400));
            kity.add(new File("find.html", 5000));

            rootDir.accept(fileFindVisitor);
            System.out.println("HTML files are:");
            fileIterator = fileFindVisitor.getFoundFiles();
            while (fileIterator.hasNext()) {
                File file = fileIterator.next();
                System.out.println(file);
            }
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
