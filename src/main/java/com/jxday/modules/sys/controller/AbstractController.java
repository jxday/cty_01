package com.jxday.modules.sys.controller;


import com.jxday.modules.sys.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected SysUser getUser() {
        return (SysUser) SecurityUtils.getSubject().getPrincipal();
    }

    protected String getUserId() {
        return getUser().getUserId();
    }
    
    protected String getUserName(){
        return getUser().getUserName();
    }

}
