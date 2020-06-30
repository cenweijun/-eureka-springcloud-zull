package com.mycen.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MycenEureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(MycenEureka2Application.class, args);
    }

}
