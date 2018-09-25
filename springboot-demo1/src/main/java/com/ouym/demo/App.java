package com.ouym.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 20:19 2018/9/21
 * @Modified By:
 */
@SpringBootApplication
@EnableCaching
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
