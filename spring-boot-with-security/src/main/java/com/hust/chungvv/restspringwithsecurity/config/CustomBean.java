package com.hust.chungvv.restspringwithsecurity.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CustomBean {

    @Value("${com.chungvv.key1}")
    private String key1;

    @Value("${com.chungvv.key2}")
    private String key2;

    public CustomBean() {
        System.out.println("This is constructor custom bean");
        System.out.println("In constructor Key1: "+key1+", key2: "+key2);
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("This is post construct custom bean");
        System.out.println("In post constructor Key1: "+key1+", key2: "+key2);
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("This is pre destroy custom bean");
    }
}
