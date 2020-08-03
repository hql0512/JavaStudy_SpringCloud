package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  //激活并开启Feign
public class Order80FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Order80FeignApplication.class,args);
    }
}
