package com.hust.chungvv.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.hust.chungvv")
@EnableEurekaClient
public class GaleryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GaleryServiceApplication.class, args);
    }
}
