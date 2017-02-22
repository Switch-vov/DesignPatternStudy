package com.pc.decorator.example;

/**
 * 完全边框装饰类
 * Created by Switch on 2017-02-21.
 */
public class FullBorder extends Border {
    /**
     * 构造方法，传入待装饰的显示类对象
     *
     * @param display 显示类对象
     */
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) { // 上边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {  // 下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else { // 内容
            return "|" + this.display.getRowText(row - 1) + "|";
        }
    }

    /**
     * 生成一个重复的count次的ch字符串
     *
     * @param c     字符
     * @param count 次数
     * @return 重复的count次的ch字符串
     */
    private String makeLine(char c, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(c);
        }
        return builder.toString();
    }
}
