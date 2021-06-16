package com.example.springapigatewayservice;

import org.hibernate.validator.constraints.URL;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Component
public class RouterValidator {

//    https://ihorkosandiak.medium.com/spring-cloud-gateway-security-with-jwt-93341b342020

    public  static  final List<String> openApiEndPoints = Arrays.asList("api/v1/auth/register","api/v1/auth/login");


    public Predicate<ServerHttpRequest>isSecured = serverHttpRequest -> openApiEndPoints.stream().noneMatch(uri->
            serverHttpRequest.getURI().getPath().contains(uri));

}
