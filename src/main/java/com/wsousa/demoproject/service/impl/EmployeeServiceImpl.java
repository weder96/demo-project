package com.wsousa.demoproject.service.impl;

import com.wsousa.demoproject.domain.Employee;
import com.wsousa.demoproject.repository.EmployeeRepository;
import com.wsousa.demoproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.listAll();
    }
}
