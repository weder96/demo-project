package com.wsousa.demoproject.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class RestaurantValidator  implements ConstraintValidator<Restaurant, String> {

    List<String> restaurants = Arrays.asList("Soninha", "Barriga Cheia", "Yohana's Restaurant", "Los Pampas");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return restaurants.contains(value);
    }
}