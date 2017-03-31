package com.pc.interpreter.example;

/**
 * 节点类
 */
public abstract class Node {
    /**
     * 解析
     *
     * @param context 上下文
     * @throws ParseException 解析异常
     */
    public abstract void parse(Context context) throws ParseException;
}
