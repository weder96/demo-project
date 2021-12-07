package com.wsousa.demoproject.service;

import com.wsousa.demoproject.domain.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getEmployees();
}
