package com.tw.springbootdemo.service;

import com.tw.springbootdemo.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {
    /**
     * 创建线程安全的Map
     */
    private static Map<Integer, Employee> employees = Collections.synchronizedMap(new HashMap<>());

    static {
        employees.put(0,new Employee(0, "小明", 20, "男"));
        employees.put(1,new Employee(1, "小红", 19, "女"));
        employees.put(2,new Employee(2, "小智", 15, "男"));
        employees.put(3,new Employee(3, "小刚", 16, "男"));
    }

    public List<Employee> getEmployees() {
        return  new ArrayList<>(employees.values());
    }
}
