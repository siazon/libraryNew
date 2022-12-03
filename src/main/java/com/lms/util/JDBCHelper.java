package com.lms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCHelper {
    public static Connection JDBCConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection jdbcConnection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "root");
            return  jdbcConnection;
        }catch (Exception e){

        }
        return null;
    }


}
