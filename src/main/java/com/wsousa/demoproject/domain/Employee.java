package com.wsousa.demoproject.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(sequenceName = "employee_seq", allocationSize = 1, name = "employee_seq")
    private Long id;

    private String name;
    private int age;
}
