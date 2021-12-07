package com.wsousa.demoproject.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {
    private String name;
    private int age;
}
