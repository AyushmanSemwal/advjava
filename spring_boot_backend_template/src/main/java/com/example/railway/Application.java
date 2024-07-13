package com.example.railway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.app", "com.example.railway"})
@EnableJpaRepositories(basePackages = "com.example.railway.repositories")
@EntityScan(basePackages = "com.example.railway.entities")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
