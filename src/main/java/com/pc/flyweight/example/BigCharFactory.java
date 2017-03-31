package com.pc.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 大字符工厂类
 * Created by Switch on 2017/3/31.
 */
public final class BigCharFactory {
    /**
     * 管理已经生成的BigChar的实例
     */
    private Map<String, BigChar> pool = new HashMap<>();

    /**
     * 唯一实例
     */
    private static BigCharFactory instance = new BigCharFactory();

    /**
     * 获取实例
     *
     * @return 实例
     */
    public static BigCharFactory getInstance() {
        return instance;
    }

    private BigCharFactory() {

    }

    /**
     * 生成(共享)BigChar类的实例
     *
     * @param charname 字符名
     * @return 大字符对象
     */
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
