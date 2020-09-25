package cn.itcast.dao;

import cn.itcast.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/09/24 16:31
 */


public class RoleDaoTest {

    private SqlSession sqlSession;
    private InputStream inputStream;
    private RoleDao roleDao;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSession = new SqlSessionFactoryBuilder().build(inputStream).openSession(true);
        roleDao = sqlSession.getMapper(RoleDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void findAll() {
        List<Role> roleList = roleDao.findAll();
        for(Role role:roleList){
            System.out.println(role);
        }
    }
}