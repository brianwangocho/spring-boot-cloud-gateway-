package com.example.springapigatewayservice;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringApiGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiGatewayServiceApplication.class, args);


    }

}
