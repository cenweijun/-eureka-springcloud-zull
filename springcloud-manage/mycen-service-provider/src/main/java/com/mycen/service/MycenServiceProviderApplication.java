package com.mycen.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.mycen.service.mapper")
@EnableDiscoveryClient  //是springcloud提供的 启动eureka客户端   @EnableEurekaClient是nefix提供的
public class MycenServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycenServiceProviderApplication.class, args);
    }

}
