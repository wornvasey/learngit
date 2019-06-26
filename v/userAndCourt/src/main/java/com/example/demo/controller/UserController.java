package com.example.demo.controller;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WangLei on 18-6-4.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser")
    public String addUser(int courtId, int userId) {
        return userService.addUser(courtId, userId);
    }

}
