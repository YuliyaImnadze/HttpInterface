package com.example.requesttojparest.restclientjparest.v1.client;

import com.example.requesttojparest.restclientjparest.v1.dto.EmployeeDtoV1;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface EmployeeDtoClientV1 {

    @GetExchange()
    List<EmployeeDtoV1> showAll();

    @PostExchange("/create")
    EmployeeDtoV1 create(@RequestBody EmployeeDtoV1 employeeDtoV1);
}
