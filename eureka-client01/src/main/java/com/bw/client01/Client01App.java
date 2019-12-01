package com.bw.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client01App {

    public static void main(String[] args) {

        SpringApplication.run( Client01App.class );
    }

}
