package com.pc.memento.exercise.test;

import com.pc.memento.exercise.Gamer;
import com.pc.memento.exercise.Memento;
import org.junit.Test;

import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * Memento Tester.
 *
 * @author Switch
 * @version 1.0
 */
public class MementoTest {
    public static final String SAVEFILENAME = "D://game.dat";

    @Test
    public void testMemento() {
        Gamer gamer = new Gamer(20);               // 最初的所持金钱数为100
        Memento memento = loadMemento();            // 从文件中读取起始状态
        if (memento != null) {
            System.out.println("读取上次保存存档开始游戏。");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新游戏。");
            memento = gamer.createMemento();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("==== " + i);        // 显示次数
            System.out.println("当前状态:" + gamer);    // 显示当前主人公的状态

            gamer.bet();    // 进行游戏

            System.out.println("所持金钱为" + gamer.getMoney() + "元。");

            // 决定如何处理Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （所持金钱增加了许多，因此保存游戏当前的状态）");
                memento = gamer.createMemento();
                saveMemento(memento);   //  保存至文件
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （所持金钱减少了许多，因此将游戏恢复至以前的状态）");
                gamer.restoreMemento(memento);
            }

            // 等待一段时间
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }

    public void saveMemento(Memento memento) {
        try {
            ObjectOutput out = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(SAVEFILENAME)));
            out.writeObject(memento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Memento loadMemento() {
        Memento memento = null;
        try {
            ObjectInput in = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVEFILENAME)));
            memento = (Memento) in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
