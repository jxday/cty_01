package com.jxday.modules.sys.entity;

import java.io.Serializable;

/**
 * 〈系统用户〉
 *
 * @author cty
 * @ClassName SysUser
 * @create 2019-11-08 16:37
 * @Version 1.0.0
 */

public class SysUser implements Serializable {
    private static final long serialVersionUID = 1l;
    
    private String userId;
    private String userName;
    private String name;
    private String password;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public SysUser() {
    }

    public SysUser(String userId, String userName, String name, String password) {
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.password = password;
    }
    
}
