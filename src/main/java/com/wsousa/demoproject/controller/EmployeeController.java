package com.wsousa.demoproject.controller;

import com.wsousa.demoproject.domain.Employee;
import com.wsousa.demoproject.dto.EmployeeDTO;
import com.wsousa.demoproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    @ResponseBody
    public List<Employee> index(){
        return employeeService.getEmployees();
    }

    @GetMapping("/greetings/{id}")
    public String callParameterId(@PathVariable(name = "id") Long id){
        return "Greetings from Spring Boot "+id;
    }

    @GetMapping("/greetings/param")
    public String callRequestParamId(@RequestParam Long id, @RequestParam String name){
        return "Greetings "+ name +" from Spring Boot "+id;
    }

    @PostMapping("/greetings/post")
    @ResponseBody
    public String callPost(@RequestParam(name="id") Long id, @RequestParam(name="name") String name){
        return "Greetings "+ name +" from Spring Boot "+id;
    }

    @PostMapping("/greetings/posts")
    @ResponseBody
    public String callPosts(@RequestParam(name="id") Optional<String> id){
        return "Greetings from Spring Boot "+id.orElseGet(()-> "Not Provided");
    }

    @PostMapping("/greetings/posts/array")
    @ResponseBody
    public String callPosts(@RequestParam List<String> id){
        return "Greetings from Spring Boot "+id;
    }

    @PostMapping("/greetings/save")
    @ResponseBody
    public Employee callPostsSave(@RequestBody EmployeeDTO employee){
        Employee empl = new Employee();
        empl.setName(employee.getName());
        empl.setAge(employee.getAge());
        return employeeService.saveEmployee(empl);
    }

    @PutMapping("/greetings/update/{id}")
    @ResponseBody
    public EmployeeDTO callPostsSave(@RequestBody EmployeeDTO employee, @PathVariable(name = "id") int id ){
        employee.setAge(id);
        return employee;
    }

    @DeleteMapping("/greetings/{id}")
    public String callDeleteId(@PathVariable(name = "id") Long id){
        return "Deletado com sucesso !!!"+id;
    }

}
