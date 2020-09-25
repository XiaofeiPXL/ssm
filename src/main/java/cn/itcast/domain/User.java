package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: ssm
 * @description: User对象
 * @author: Xiaofei Wang
 * @created: 2020/09/23 19:26
 */


public class User implements Serializable {
    private Integer id;
    private String username;
    private String sex;
    private String address;
    private Date birthday;
    //主表实体类应该包含从表实体类的集合引用
    private List<Account> accounts;

    //多对多关系映射,一个用户可以有多个角色
    private List<Role> roles;
    //不能省略无参构造器,否则mybatis会报错
    public User() {
    }

    public User(Integer id, String username, String sex, String address, Date birthday, List<Account> accounts, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
        this.accounts = accounts;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", accounts=" + accounts +
                ", roles=" + roles +
                '}';
    }
}
