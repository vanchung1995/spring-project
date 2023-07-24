package com.hust.chungvv.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.hust.chungvv")
public class ImageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageServiceApplication.class, args);
    }
}
