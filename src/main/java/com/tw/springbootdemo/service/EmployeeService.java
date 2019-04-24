package com.tw.springbootdemo.service;

import com.tw.springbootdemo.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeService {

    private static List<Employee> employees = new LinkedList<>();
    static{
        employees.add(new Employee(0,"小明",20,"男"));
        employees.add(new Employee(1,"小红",19,"女"));
        employees.add(new Employee(2,"小智",15,"男"));
        employees.add(new Employee(3,"小刚",16,"男"));
    }


    public List<Employee> getEmployees(){
        return employees;
    }
}
