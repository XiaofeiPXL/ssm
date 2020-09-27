package cn.itcast.dao;

import cn.itcast.BaseTest;
import cn.itcast.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


/**
 * @program: ssm
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/09/24 14:43
 */


public class AccountDaoTest extends BaseTest {

    private SqlSession sqlSession = init();

    @Test
    public void findAll() {
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        BaseTest.destroy(sqlSession,null,null);
    }

}