package cn.itcast.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @program: ssm
 * @description: ROLE
 * @author: Xiaofei Wang
 * @created: 2020/09/24 15:53
 */


public class Role implements Serializable {
    private Integer id;
    private String roleName;
    private String roleDesc;

    //多对多关系映射,一个角色可以赋予多个用户
    private List<User> users;

    public Role() {
    }

    public Role(Integer id, String roleName, String roleDesc, List<User> users) {
        this.id = id;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "RoleDao{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", users=" + users +
                '}';
    }
}
