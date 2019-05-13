package com.yoshimi.springbootstore.dao;

import com.yoshimi.springbootstore.domain.Book;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 接口类
 */
@Repository
public interface BookDao {

    public void insert( Book book);
    public  Book delete(Long  id);
    public  Book update(Book book);
    public  Book  findById(Long id);
    public List<Book>findAll();


}
