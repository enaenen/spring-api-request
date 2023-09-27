package com.example.springapirequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringApiRequestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiRequestApplication.class, args);
    }

}
