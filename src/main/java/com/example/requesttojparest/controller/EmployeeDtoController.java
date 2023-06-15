package com.example.requesttojparest.controller;

import com.example.requesttojparest.restclientjparest.v1.client.EmployeeDtoClientV1;
import com.example.requesttojparest.restclientjparest.v1.dto.EmployeeDtoV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employeedto")
public class EmployeeDtoController {

    private final EmployeeDtoClientV1 service;

    @Autowired
    public EmployeeDtoController(EmployeeDtoClientV1 service) {
        this.service = service;
    }

    @GetMapping
    public List<EmployeeDtoV1> showAll() {
        return service.showAll();
    }

    @PostMapping("/create")
    public EmployeeDtoV1 create(@RequestBody EmployeeDtoV1 employeeDtoV1) {
        return service.create(employeeDtoV1);
    }


}
