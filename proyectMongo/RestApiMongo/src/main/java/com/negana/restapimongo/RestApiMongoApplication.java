package com.negana.restapimongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
public class RestApiMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiMongoApplication.class, args);
    }

}
