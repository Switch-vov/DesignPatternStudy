package com.pc.abstractfactory.example.factory;

/**
 * 抽象工厂类
 * Created by Switch on 2017-02-17.
 */
public abstract class Factory {
    /**
     * 获取工厂
     *
     * @param className 全限定符的类名
     * @return 工厂对象
     */
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    /**
     * 创建链接
     *
     * @param caption 标题
     * @param url     url
     * @return 链接对象
     */
    public abstract Link createLink(String caption, String url);

    /**
     * 创建Tray
     *
     * @param caption 标题
     * @return Tray对象
     */
    public abstract Tray createTray(String caption);

    /**
     * 创建页面
     *
     * @param title  标题
     * @param author 作者
     * @return 页面对象
     */
    public abstract Page createPage(String title, String author);

}
