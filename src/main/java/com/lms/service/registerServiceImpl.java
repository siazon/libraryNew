package com.lms.service;

import com.lms.dao.registerDao;
import com.lms.dao.registerDaoImpl;
import com.lms.entity.User;

public class registerServiceImpl implements registerService{
    registerDao rd = new registerDaoImpl();
    @Override
    public String registerService(User user_from_servlet) {
        String user_createby_service = rd.registerDao(user_from_servlet);
        return user_createby_service;

    }
}
