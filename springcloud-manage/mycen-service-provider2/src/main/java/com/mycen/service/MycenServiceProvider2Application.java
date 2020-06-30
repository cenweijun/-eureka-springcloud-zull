package com.mycen.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mycen.service.mapper")
public class MycenServiceProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(MycenServiceProvider2Application.class, args);
    }

}
