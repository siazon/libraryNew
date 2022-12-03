package com.lms.dao;

import com.lms.entity.User;

public interface loginDao {
    User loginDao(User u);

    Boolean updateUserName(User u_param);
}
