package com.javafetching.controller;

import com.javafetching.dto.Employee;
import com.javafetching.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee addNewEmployeeToSystem(@RequestBody @Valid Employee employee){
        return service.addNewEmployee(employee);
    }
}
