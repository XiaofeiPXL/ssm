package cn.itcast.dao;

import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: ssm
 * @description: Test myBatis second level cache
 * @author: Xiaofei Wang
 * @created: 2020/09/24 23:23
 */


public class SecondLevelCacheTest {
    private InputStream inputStream;
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @After
    public void destroy() throws IOException {
        inputStream.close();
    }

    @Test
    public void testSecondLevelCache() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        UserDao userDao_1 = sqlSession1.getMapper(UserDao.class);
        User user_1 = userDao_1.findUserById(41);
        sqlSession1.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        UserDao userDao_2 = sqlSession2.getMapper(UserDao.class);
        User user_2 = userDao_2.findUserById(41);
        sqlSession2.close();

        System.out.println(user_1==user_2);
    }
}
