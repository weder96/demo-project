package com.wsousa.demoproject.dto;

import com.wsousa.demoproject.validation.Restaurant;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestaurantDTO {
    private Long id;

    @Restaurant
    @NotBlank(message = "Name is Mandatory")
    private String name;

    private Long kitchenId;
}
