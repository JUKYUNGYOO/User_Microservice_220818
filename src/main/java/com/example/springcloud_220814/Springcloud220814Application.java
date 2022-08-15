package com.example.springcloud_220814;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //마이크로 서비스를 유레카 서버에 등록 가능
public class Springcloud220814Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud220814Application.class, args);
    }

}
