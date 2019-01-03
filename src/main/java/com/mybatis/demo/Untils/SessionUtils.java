package com.mybatis.demo.Untils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionUtils {
    private static SqlSessionFactoryBuilder builder;
    private static SqlSessionFactory factory;

    /*
    初始化SqlSessionFactory
    *  */
    static {
        try {
            builder = new SqlSessionFactoryBuilder();
            InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    获取sqlsession
    * */
    public static SqlSession getSession() {
        return factory.openSession();
    }

}
