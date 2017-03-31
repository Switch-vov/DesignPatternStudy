package com.pc.interpreter.example.test;

import com.pc.interpreter.example.Context;
import com.pc.interpreter.example.Node;
import com.pc.interpreter.example.ProgramNode;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Interpreter Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class InterpreterTest {
    /**
     * 测试解释器模式
     */
    @Test
    public void testInterpreter() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")
                    + "/src/main/java/com/pc/interpreter/example/program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
