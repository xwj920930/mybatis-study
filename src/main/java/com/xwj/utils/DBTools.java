package com.xwj.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBTools {
    public static SqlSession getSession(){
        SqlSessionFactory factory=null;
        try {
            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            factory=new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return factory.openSession();
    }
}
