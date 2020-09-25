package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @program: ssm
 * @description: AccountDao
 * @author: Xiaofei Wang
 * @created: 2020/09/24 14:39
 */


public interface AccountDao {
    /**
     * 查询全部的账户信息,同时返回对应的用户信息
     * @return
     */
    List<Account> findAll();
}
