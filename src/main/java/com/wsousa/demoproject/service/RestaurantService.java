package com.wsousa.demoproject.service;

import com.wsousa.demoproject.dto.RestaurantDTO;

import java.util.List;

public interface RestaurantService {
    RestaurantDTO saveRestaurant(RestaurantDTO restaurant);
    List<RestaurantDTO> getAllRestaurants();
}
