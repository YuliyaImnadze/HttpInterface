package com.example.requesttojparest.restclientjparest.config;

import com.example.requesttojparest.restclientjparest.v1.client.EmployeeDtoClientV1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class JpaRestConfig {

    @Bean
    public EmployeeDtoClientV1 EmployeeDtoClientV1() {
        WebClient client = WebClient.builder().baseUrl("http://localhost:8081/api/v1/employee").build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
        EmployeeDtoClientV1 service = factory.createClient(EmployeeDtoClientV1.class);
        return service;
    }
}

