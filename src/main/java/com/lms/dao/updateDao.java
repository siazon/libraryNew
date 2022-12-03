package com.lms.dao;

import com.lms.bean.BookInfo;

public interface updateDao {
    Boolean updateDao(BookInfo bookInfoFromServlet);

    Boolean addDao(BookInfo b_param);

    boolean deleteBook(int bookid);
}
