package main.java.com.cyy.pojo;

import main.java.com.cyy.dao.UserDao;


/**
 * Created by 12576 on 2020/2/10.
 */
public class UserService {


    private UserDao userDao;

    public UserService() {

    }

    public void print() {
        userDao.print();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
}
