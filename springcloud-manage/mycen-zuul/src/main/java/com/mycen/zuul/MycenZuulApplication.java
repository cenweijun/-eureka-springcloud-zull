package com.mycen.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MycenZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycenZuulApplication.class, args);
    }

}
