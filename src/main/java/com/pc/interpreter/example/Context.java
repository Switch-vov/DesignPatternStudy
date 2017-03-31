package com.pc.interpreter.example;


import java.util.StringTokenizer;

/**
 * 上下文类
 */
public class Context {
    /**
     * 分词器
     */
    private StringTokenizer tokenizer;
    /**
     * 当前符号
     */
    private String currentToken;

    public Context(String text) {
        this.tokenizer = new StringTokenizer(text);
        this.nextToken();
    }

    /**
     * 返回下一个符号
     *
     * @return 下一个符号
     */
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            this.currentToken = this.tokenizer.nextToken();
        } else {
            this.currentToken = null;
        }
        return this.currentToken;
    }

    /**
     * 返回当前符号
     *
     * @return 当前符号
     */
    public String currentToken() {
        return this.currentToken;
    }

    /**
     * 跳过指定符号
     *
     * @param token 指定符号
     * @throws ParseException 解析异常
     */
    public void skipToken(String token) throws ParseException {
        if (!token.equals(this.currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
        }
        this.nextToken();
    }

    /**
     * 解析数值
     *
     * @return 数值
     * @throws ParseException 解析异常
     */
    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }
        return number;
    }
}
