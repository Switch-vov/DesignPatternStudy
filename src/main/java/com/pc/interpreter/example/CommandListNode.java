package com.pc.interpreter.example;

import java.util.ArrayList;

/**
 * 命令列表节点类
 * <command list> ::= <command>* end
 */
public class CommandListNode extends Node {
    /**
     * 命令列表
     */
    private ArrayList list = new ArrayList();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
