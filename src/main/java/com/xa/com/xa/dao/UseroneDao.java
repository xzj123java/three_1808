package com.xa.com.xa.dao;

import com.xa.pojo.PagaBean;
import com.xa.pojo.Userone;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UseroneDao extends BaseDao {
    public List<Userone> getAllUserone() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        List<Userone> userones = sqlSession.selectList("getAllUserone");
        return userones;
    }

    /***
     *
     * 增加
     */
    public void addUserone(Userone userone) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.insert("addUserone", userone);
        sqlSession.commit();
    }

    /**
     * 删除
     */
    public void deleteUserById(int id) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.delete("deleteUserById", id);
        sqlSession.commit();
    }

    /**
     * 修改
     */
    public void updateUserone(Userone userone) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.delete("updateUserone", userone);
        sqlSession.commit();
    }

    /**
     * 动态查询
     *
     * @param
     */
    public List<Userone> selectAll(Userone userone) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        List<Userone> user = sqlSession.selectList("selectAll", userone);
        return user;
    }

    /**
     * 加入映射查询
     */
    public List<Userone> getallMap() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        List<Userone> user = sqlSession.selectList("getallMap");
        return user;
    }

    /**
     * 分页的方法
     */
    public List<Userone> queryUsersBySql(PagaBean pagaBean) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        List<Userone> user = sqlSession.selectList("queryUsersBySql",pagaBean);
        sqlSession.close();
        return user;
    }
}
