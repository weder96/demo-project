package com.wsousa.demoproject.repository;

import com.wsousa.demoproject.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query(value = "select e from com.wsousa.demoproject.domain.Employee e")
    List<Employee> listAll();

}
