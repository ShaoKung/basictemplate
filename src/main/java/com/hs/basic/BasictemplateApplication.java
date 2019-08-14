package com.hs.basic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.hs.basic.dao")
public class BasictemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasictemplateApplication.class, args);
    }

}
