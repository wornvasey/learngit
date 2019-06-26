package com.example.demo.dao;


import com.example.demo.modle.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



    /**
     * Created by WangLei on 18-6-4.
     */
    @Transactional
    @Repository
    public interface UserDao  extends JpaRepository<User, Integer> {

    }



