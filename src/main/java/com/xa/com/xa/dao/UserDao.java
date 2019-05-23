package com.xa.com.xa.dao;

import com.xa.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UserDao extends BaseDao {
    //写方法
    public User getUserByid(int id) throws IOException {
        User user =null;
        //得到session
        SqlSession sqlSession = this.getSqlSession();
        //传参给user 返回user
        user = sqlSession.selectOne("findById",id);
        return user;
    }

    public List<User> getUserByLike(String param) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
       List<User> user = sqlSession.selectList("findByLike","%"+param+"%");
        return user;
    }
}
