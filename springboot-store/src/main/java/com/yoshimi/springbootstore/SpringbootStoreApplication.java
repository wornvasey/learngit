package com.yoshimi.springbootstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Spring Boot 应用启动类
 */
// Spring Boot 应用的标识
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.yoshimi.springbootstore.dao")

public class SpringbootStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStoreApplication.class, args);
    }

}
