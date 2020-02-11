package main.java.com.cyy.service;

import main.java.com.cyy.dao.UserDao;

import java.util.logging.Logger;

/**
 * Created by 12576 on 2020/2/10.
 */


public class UserImpl implements UserDao{

    private static final Logger log=Logger.getLogger(String.valueOf(UserImpl.class));

    private String userName;


    public void print() {
       log.info("ref传值====》》》Hello:"+userName);
       throw new  RuntimeException("测试异常增强！");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
