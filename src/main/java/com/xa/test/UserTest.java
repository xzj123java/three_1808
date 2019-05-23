package com.xa.test;


import com.xa.com.xa.dao.UserDao;
import com.xa.com.xa.dao.UseroneDao;
import com.xa.pojo.User;
import com.xa.pojo.Userone;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserTest {
    public static void main(String[] args) throws IOException {
//        //连接池
//        String resource = "mybatis-config.xml";
//        //IO输入流
//        Reader reader = null;
//        try {
//            //获取一个资源
//            reader = Resources.getResourceAsReader(resource);
//            //sql的会话工厂 通过流读取
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            //打开会话
//            SqlSession session = sqlSessionFactory.openSession();
//            //调用方法查询一个传参
//            User user = session.selectOne("findById", 1);
//            //提交(增删改为硬盘操作)
//            session.commit();
//            System.out.println(user.getName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//          UserDao userDao = new UserDao();
////        User user = userDao.getUserByid(2);
//        List<User> user = userDao.getUserByLike("李");
//
//        for (User user1 :user ) {
//            System.out.println(user1.getName());
//        }
        /***
         * oracle的查询
         */
//        UseroneDao useroneDao = new UseroneDao();
//         List<Userone> userone= useroneDao.getAllUserone();
//        for (Userone userones:userone
//             ) {
//            System.out.println(userones.getU_name());
//        }
//        /***
//         *  oracle的增加
//         */
//        UseroneDao useroneDao = new UseroneDao();
//        Userone userone = new Userone();
//        userone.setU_name("张之洞");
//        userone.setU_pass("147258");
//        useroneDao.addUserone(userone);
////        System.out.println("添加成功");
//        /**
//         * oracle的删除
//         */
//        UseroneDao useroneDao = new UseroneDao();
//        useroneDao.deleteUserById(1);
//        System.out.println("删除成功");

//        /**
//         * 修改
//         */
//        UseroneDao useroneDao = new UseroneDao();
//        Userone userone = new Userone();
//        userone.getU_id(2);
//        userone.setU_name("张之洞");
//        userone.setU_pass("147258");
//        useroneDao.addUserone(userone);
//        System.out.println("修改成功");

        /**
         * 动态查询
         */
//        UseroneDao useroneDao = new UseroneDao();
//        Userone userone = new Userone();
//        userone.setU_name("张之洞");
//        userone.setU_id(5);
//        List<Userone> user = useroneDao.selectAll(userone);
//        for (Userone users :
//                user) {
//            System.out.println(users);
//        }

        /***
         * oracle的查询
         */
        UseroneDao useroneDao = new UseroneDao();
         List<Userone> userone= useroneDao.getallMap();
        for (Userone userones:userone
             ) {
            System.out.println(userones);
        }
    }
}

