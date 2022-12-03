package com.lms.dao;

import com.lms.bean.BookInfo;
import com.lms.util.JDBCHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class updateDaoImpl implements updateDao{


    @Override
    public Boolean updateDao(BookInfo bookInfoFromService) {
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "UPDATE lms_book a set a.book_name=?,a.book_no_of_copy=?,locationRackId=?,author_id=?,categoryId=? where a.book_id=?;";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            crunchifyPrepareStat.setString(1, bookInfoFromService.getBookName());
            crunchifyPrepareStat.setInt(2, bookInfoFromService.getQuantity());
            crunchifyPrepareStat.setInt(3, bookInfoFromService.getLocationRackId());
            crunchifyPrepareStat.setInt(4, bookInfoFromService.getAuthor_id());
            crunchifyPrepareStat.setInt(5, bookInfoFromService.getCategorId());
            crunchifyPrepareStat.setInt(6, bookInfoFromService.getBookId());
            int rs = crunchifyPrepareStat.executeUpdate();
           return rs>0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean addDao(BookInfo b_param) {
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "insert into lms_book (author_id,locationRackId,book_name,book_no_of_copy,book_status," +
                    "book_added_on,book_updated_on,categoryId) values(?,?,?,?,?,?,?,?);";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            crunchifyPrepareStat.setInt(1, b_param.getAuthor_id());
            crunchifyPrepareStat.setInt(2, b_param.getLocationRackId());
            crunchifyPrepareStat.setString(3, b_param.getBookName());
            crunchifyPrepareStat.setInt(4, b_param.getQuantity());
            crunchifyPrepareStat.setString(5, "Enable");
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date now = new Date();
            crunchifyPrepareStat.setString(6, sdf.format(now));
            crunchifyPrepareStat.setString(7, sdf.format(now));
            crunchifyPrepareStat.setInt(8, b_param.getCategorId());
            int rs = crunchifyPrepareStat.executeUpdate();
            return rs>0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteBook(int bookid) {
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "delete from lms_book where book_id=?";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            crunchifyPrepareStat.setInt(1, bookid);
            int rs = crunchifyPrepareStat.executeUpdate();
            return rs>0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
