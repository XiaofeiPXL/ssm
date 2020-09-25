package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

/**
 * @program: ssm
 * @description: UserDao接口
 * @author: Xiaofei Wang
 * @created: 2020/09/23 19:33
 */


public interface UserDao {

    /**
     * 查询所有用户
     * @return 全部用户列表
     */
    List<User> findAll();

    /**
     * 保存用户
     *
     * @param user 没有返回
     */
    void saveUser(User user);

    /**
     * 更新用户信息
     *
     * @param user 用户对象
     */
    void updateUser(User user);

    /**
     * 删除用户信息
     *
     * @param id 用户ID
     */
    void deleteUser(Integer id);

    /**
     * 根据用户ID查询用户信息
     *
     * @param id 用户ID
     * @return 返回用户信息
     */
    User findUserById(Integer id);

    /**
     * 根据名称模糊查询用户信息
     *
     * @param username 用户姓名
     * @return 用户列表
     */
    List<User> findUserByName(String username);

    /**
     * 查询总的用户数
     *
     * @return 用户数量
     */
    int findTotal();

    /**
     * 根据传入的参数条件查询用户信息
     *
     * @param user 查询的条件,有可能有用户名,有可能有性别,也有可能有地址,还有可能是都有
     * @return 用户信息列表
     */
    List<User> findUserByCondition(User user);
}
