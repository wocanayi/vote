package com.qtt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author XC
 */
@SpringBootApplication
@MapperScan("com.qtt.dao")
public class QutingtingApplication {

    public static void main(String[] args) {
        SpringApplication.run(QutingtingApplication.class, args);
        System.out.println("永无BUG");
    }

}
