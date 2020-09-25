package cn.itcast.dao;

import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.support.SQLStateSQLExceptionTranslator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


/**
 * @program: ssm
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/09/23 19:35
 */


public class UserDaoTest {
    private SqlSession sqlSession;
    private InputStream inputStream;
    private UserDao userDao;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSession = new SqlSessionFactoryBuilder().build(inputStream).openSession(true);
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void findAll() {
        List<User> userList = userDao.findAll();
        for(User user : userList){
            System.out.println(user);
        }
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUsername("点点");
        user.setSex("男");
        user.setAddress("68 Pasadena Cres");
        user.setBirthday(new Date());
        userDao.saveUser(user);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(51);
        user.setUsername("diandian");
        user.setSex("男");
        user.setAddress("68 Pasadena Crescent");
        user.setBirthday(new Date());
        userDao.updateUser(user);
    }

    @Test
    public void deleteUser() {
        userDao.deleteUser(51);
    }

    @Test
    public void findUserById() {
        User user = userDao.findUserById(51);
        System.out.println(user);
    }

    @Test
    public void findUserByName() {
        List<User> userList = userDao.findUserByName("%王%");
        for(User user:userList){
            System.out.println(user);
        }
    }

    @Test
    public void findTotal() {
        System.out.println(userDao.findTotal());
    }

    @Test
    public void findUserByCondition() {
        User user = new User();
        user.setSex("男");
        user.setUsername("diandian");
        List<User> userList = userDao.findUserByCondition(user);
        for(User userInfo:userList){
            System.out.println(userInfo);
        }
    }
}