package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @program: ssm
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/09/24 14:43
 */


public class AccountDaoTest {
    private SqlSession sqlSession;
    private InputStream inputStream;
    private AccountDao accountDao;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession(true);
        accountDao = sqlSession.getMapper(AccountDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.close();
        inputStream.close();
    }
    @Test
    public void findAll() {
       List<Account> accountList = accountDao.findAll();
       for(Account account:accountList){
           System.out.println(account);
       }
    }
}