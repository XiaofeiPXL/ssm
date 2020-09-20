package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @program: ssm
 * @description: Service Interface
 * @author: Xiaofei Wang
 * @created: 2020/09/19 20:32
 */


public interface AccountService {
    public void saveAccount(Account account);

    public List<Account> findAll();
}
