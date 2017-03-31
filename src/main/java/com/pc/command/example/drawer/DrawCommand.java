package com.pc.command.example.drawer;

import com.pc.command.example.command.Command;

import java.awt.*;

/**
 * 绘图命令类
 */
public class DrawCommand implements Command {
    /**
     * 绘制对象
     */
    protected Drawable drawable;
    /**
     * 绘制位置
     */
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
