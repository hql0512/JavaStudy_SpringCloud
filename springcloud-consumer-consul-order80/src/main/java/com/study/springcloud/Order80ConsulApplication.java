package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Order80ConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Order80ConsulApplication.class,args);
    }
}
