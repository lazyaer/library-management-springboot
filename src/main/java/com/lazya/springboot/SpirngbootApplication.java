package com.lazya.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lazya.springboot.mapper")
@SpringBootApplication
public class SpirngbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngbootApplication.class, args);
    }

}
