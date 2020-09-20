package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm
 * @description: AccountService impl
 * @author: Xiaofei Wang
 * @created: 2020/09/19 20:33
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public void saveAccount(Account account) {
        //accountDao.saveAccount(account);
        System.out.println("业务层：保存所有账户...");
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return null;
    }
}