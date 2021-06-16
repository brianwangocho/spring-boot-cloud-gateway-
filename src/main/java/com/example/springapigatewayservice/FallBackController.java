package com.example.springapigatewayservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/movieServiceFallBack")
    public String movieServiceFallBackMethod(){
        return "movie service is taking longer than expected try again later";
    }

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "user service is taking longer than expected try again later";
    }
}
