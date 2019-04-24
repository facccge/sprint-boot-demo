package com.tw.springbootdemo.controller;

import com.tw.springbootdemo.domain.Employee;
import com.tw.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getEmployees(){
        List<Employee> result = new ArrayList<>(employeeService.getEmployees());
        return result;
    }
}
