package com.lms.dao;

import com.lms.entity.User;
import com.lms.util.JDBCHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDaoImpl implements loginDao{
    public User loginDao(User user_createBy_service) {
        User user_creatByDao = new User();

        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select * from user where u_id=" + user_createBy_service.getUser_id();
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            //crunchifyPrepareStat.setString(1, "");
            ResultSet rs = crunchifyPrepareStat.executeQuery();
            while (rs.next()) {
                int uid = rs.getInt("u_id");
                user_creatByDao.setUser_id(uid);
                String name = rs.getString("u_name");
                user_creatByDao.setUser_name(name);
                String pwd = rs.getString("u_pwd");
                user_creatByDao.setUser_password(pwd);
            }
        } catch (Exception e) {
        }

        return user_creatByDao;
    }

    @Override
    public Boolean updateUserName(User u_param) {
        User user_creatByDao = new User();
        int rs = 0;
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "update lms_user set user_name='Effy' where user_id=12";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            //crunchifyPrepareStat.setString(1, "");
            rs = crunchifyPrepareStat.executeUpdate();
            return true;

        } catch (Exception e) {
        }

        return (rs > 0);
    }

}
