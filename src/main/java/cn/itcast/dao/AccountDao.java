package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @program: ssm
 * @description: AccountDao Interface
 * @author: Xiaofei Wang
 * @created: 2020/09/19 20:29
 */


public interface AccountDao {
    /**
     * 保存账户
     * @param account 新的账户
     */
    public void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return 全部的账户列表
     */
    public List<Account> findAll();
}
