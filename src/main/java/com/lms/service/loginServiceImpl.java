package com.lms.service;

import com.lms.dao.loginDao;
import com.lms.dao.loginDaoImpl;
import com.lms.entity.User;

public class loginServiceImpl implements loginService{
    loginDao ld = new loginDaoImpl();
    public User loginService(User user_from_servlet){

        User user_createBy_service = ld.loginDao(user_from_servlet);
        return user_createBy_service;

    }

    @Override
    public boolean updateUserName(User u_param) {
        Boolean user_createBy_service = ld.updateUserName(u_param);
        return user_createBy_service;

    }

}
