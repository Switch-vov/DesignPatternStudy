package com.pc.facade.example;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 数据库类
 * Created by Switch on 2017/3/30.
 */
public final class Database {
    private Database() {

    }

    /**
     * 根据数据哭名获取Properties
     *
     * @param dbName 数据库名
     * @return Properties对象
     */
    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(fileName));
        } catch (Exception e) {
            System.out.println("Warning: " + fileName + " is not found.");
        }
        return prop;
    }

}
