package com.hust.chungvv.restspringwithsecurity.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ApplicationConfig {
    @PostConstruct
    private void postConstruct() {
        System.out.println("This is post construct of Configuration");
    }
}
