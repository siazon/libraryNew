package com.lms.dao;

import com.lms.entity.User;
import com.lms.util.JDBCHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class registerDaoImpl implements registerDao{
    User user_creatByDao = new User();
    @Override
    public String registerDao(User user_createby_service) {
        String exsited="用户名已经存在，请输入其他用户名。如有此账户请直接登录";
        String success="注册成功,请登录";
        String unknown="未知錯誤";
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select * from user where user_name=" + user_createby_service.getUser_name();
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            ResultSet rs = crunchifyPrepareStat.executeQuery();

            if (rs.next()) {
                return exsited;


            } else {

                String sqlAdd = "Insert * from user where user_name=" + user_createby_service.getUser_name();
                PreparedStatement crunchifyPrepareStat2 = jdbcConnection.prepareStatement(sqlAdd);
                int res=crunchifyPrepareStat2.executeUpdate();
                if(res>0){
                    return success;

                }else{
                    return unknown;

                }
            }
        } catch (Exception e) {
        }
        return unknown;

    }
}
