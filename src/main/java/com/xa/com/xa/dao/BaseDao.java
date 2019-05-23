package com.xa.com.xa.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class BaseDao {
    protected SqlSession getSqlSession() throws IOException {
        //连接连接池
        String resource = "mybatis-config.xml";
        //建立流
        Readable readable = null;
        //读取资源文件
        readable = Resources.getResourceAsReader(resource);
        //sql的会话工厂 通过流读取
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build((Reader) readable);
        //打开会话
        SqlSession session = sqlSessionFactory.openSession();
        //得到session
        return session;

    }
}
