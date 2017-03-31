package com.pc.command.example.drawer;

import com.pc.command.example.command.MacroCommand;

import java.awt.*;

/**
 * 绘制面板类
 */
public class DrawCanvas extends Canvas implements Drawable {
    /**
     * 颜色
     */
    private Color color = Color.red;
    /**
     * 要绘制的圆点的半径
     */
    private int radius = 6;
    /**
     * 命令的历史记录
     */
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
