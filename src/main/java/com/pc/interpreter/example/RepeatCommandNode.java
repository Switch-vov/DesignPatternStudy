package com.pc.interpreter.example;

/**
 * 重复命令节点类
 * <repeat command> ::= repeat <number> <command list>
 */
public class RepeatCommandNode extends Node {
    /**
     * 重复次数
     */
    private int number;
    /**
     * 命令列表节点
     */
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
