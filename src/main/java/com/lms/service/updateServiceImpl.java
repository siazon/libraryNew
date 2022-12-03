package com.lms.service;

import com.lms.bean.BookInfo;
import com.lms.dao.updateDao;
import com.lms.dao.updateDaoImpl;

public class updateServiceImpl implements updateService {
    updateDao ud = new updateDaoImpl();

    @Override
    public Boolean updateService(BookInfo bookInfoFromServlet) {
        Boolean bookInfoFromService = ud.updateDao(bookInfoFromServlet);
        return bookInfoFromService;
    }

    @Override
    public Boolean addService(BookInfo b_param) {
        Boolean bookInfoFromService = ud.addDao(b_param);
        return bookInfoFromService;
    }

    @Override
    public boolean deleteBook(int bookid) {
        return ud.deleteBook(bookid);
    }
}
