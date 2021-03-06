package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: ssm
 * @description: AccountDao
 * @author: Xiaofei Wang
 * @created: 2020/09/24 14:39
 */
@Repository
public interface AccountDao {
    // 查询所有账户
    @Select("select * from account")
    List<Account> findAll();

    // 保存帐户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
