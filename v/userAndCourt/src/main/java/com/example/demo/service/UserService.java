package com.example.demo.service;

import com.example.demo.dao.CourtDao;
import com.example.demo.dao.UserDao;
import com.example.demo.modle.Court;
import com.example.demo.modle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by WangLei on 18-6-4.
 */
@Service
public class UserService {

    // 每个场地对多10人
    private int COURT_MAX_NUM = 10;

    @Autowired
    private UserDao userDao;

    @Autowired
    private CourtDao courtDao;


    @Transactional
    public String addUser(int courtId, int userId) {
        Court court = courtDao.findByCourtId(courtId);


        if(court!=null) {
            if (court.getNum() == COURT_MAX_NUM) {
                return "场地报名超过限制!";
            }
        }

        if(court == null) {
            courtDao.save(new Court(courtId, 1));
        } else {
            courtDao.updateCourt(courtId);
        }
       // int div = 1 / 0;  //test affair.
        User result = userDao.save(new User(courtId, userId));
        return "add user " + result.getUserId() + " success!";
    }

}
