package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: ssm
 * @description: AccountDao Interface
 * @author: Xiaofei Wang
 * @created: 2020/09/19 20:29
 */

@Repository
public interface AccountDao {
    /**
     * 保存账户
     * @param account 新的账户
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return 全部的账户列表
     */
    @Select("select * from account")
    List<Account> findAll();
}
