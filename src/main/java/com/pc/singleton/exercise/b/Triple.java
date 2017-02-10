package com.pc.singleton.exercise.b;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式——登记式
 * Created by Triple on 2017-02-10.
 */
public class Triple {
    // 登记表
    private static Map<Integer, Triple> instance = new HashMap<>();
    // 编号
    private int number;

    // 静态代码块，初始化数据
    static {
        instance.put(0, new Triple(0));
        instance.put(1, new Triple(1));
        instance.put(2, new Triple(2));
    }

    /**
     * 获取默认的实例
     *
     * @return 实例对象
     */
    public static Triple getInstance() {
        return instance.get(0);
    }

    /**
     * 根据编号获取实例
     *
     * @param id 编号
     * @return 实例对象
     */
    public static Triple getInstance(int id) {
        return instance.get(id);
    }

    private Triple(int number) {
        System.out.println("编号为" + number + "的实例创建了。");
        this.number = number;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getName() + "------" + this.number + "]";
    }
}
