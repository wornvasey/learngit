package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WangLei on 18-5-29.
 */
@SpringBootApplication
@Controller
public class Application {

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
