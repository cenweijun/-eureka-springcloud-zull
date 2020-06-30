package com.mycen.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //启动erueka服务器
public class MycenEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycenEurekaApplication.class, args);
    }

}
