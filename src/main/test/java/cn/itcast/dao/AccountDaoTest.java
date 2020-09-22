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
 * @created: 2020/09/20 22:59
 */


public class AccountDaoTest {
    SqlSession sqlSession;
    InputStream inputStream;
    AccountDao accountDao;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        accountDao = sqlSession.getMapper(AccountDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }
    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("xiaolin");
        account.setMoney(10000d);
        accountDao.saveAccount(account);
    }

    @Test
    public void findAll() {
        List<Account> accountList = accountDao.findAll();
        for(Account account:accountList){
            System.out.println(account);
        }
    }
}