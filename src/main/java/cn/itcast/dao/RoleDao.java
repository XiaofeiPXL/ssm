package cn.itcast.dao;

import cn.itcast.domain.Role;

import java.util.List;

/**
 * @program: ssm
 * @description: RoleDao
 * @author: Xiaofei Wang
 * @created: 2020/09/24 16:13
 */


public interface RoleDao {
    /**
     * 查询所有角色,并返回对应角色的信息
     * @return
     */
    List<Role> findAll();
}
