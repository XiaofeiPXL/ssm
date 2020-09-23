package cn.itcast.dao;

import cn.itcast.domain.Account;
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
     *
     * @param account 新的账户
     */
    void saveAccount(Account account);

    /**
     * 查询所有账户
     *
     * @return 全部的账户列表
     */
    List<Account> findAll();

    /**
     * 根据用户id查询账户信息
     *
     * @param id 账户id
     * @return 对应的账户列表
     */
    @Select("select * from account where id = #{id}")
    Account findById(int id);

    /**
     * 修改账户信息
     * @param account 账户对象
     */
    void updateAccount(Account account);
}
