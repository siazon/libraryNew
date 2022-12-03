package com.lms.service;

import com.lms.entity.User;

public interface loginService {
    User loginService(User u);

    boolean updateUserName(User u_param);
}
