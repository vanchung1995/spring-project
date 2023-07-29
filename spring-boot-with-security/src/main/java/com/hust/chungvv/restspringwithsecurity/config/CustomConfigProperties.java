package com.hust.chungvv.restspringwithsecurity.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("custom-config/config.properties")
@ConfigurationProperties(prefix = "com.chungvv")
@Data
public class CustomConfigProperties {
    private String name;
    private String email;

    @PostConstruct
    private void postConstruct() {
        System.out.println("CustomConfigProperties: name["+this.getName()+"], email: ["+this.getEmail()+"]");
    }
}
