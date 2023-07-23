package com.hust.chungvv.restspringwithsecurity.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.hust.chungvv.restspringwithsecurity"})
@EnableJpaRepositories(basePackages = {"com.hust.chungvv.restspringwithsecurity.repository"})
@EntityScan("com.hust.chungvv.restspringwithsecurity.entity")
@EnableConfigurationProperties
public class RestspringwithsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestspringwithsecurityApplication.class, args);
	}

}
