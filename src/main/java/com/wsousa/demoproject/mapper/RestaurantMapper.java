package com.wsousa.demoproject.mapper;

import com.wsousa.demoproject.domain.Restaurant;
import com.wsousa.demoproject.dto.RestaurantDTO;
import org.modelmapper.ModelMapper;

public class RestaurantMapper {
    private static final ModelMapper restaurantMapper = new ModelMapper();

    public static RestaurantDTO entityToRestaurantDTO(Restaurant restaurant){
        RestaurantDTO restaurantDTO = restaurantMapper.map(restaurant, RestaurantDTO.class);
        return restaurantDTO;
    }

    public static Restaurant RestaurantDTOToEntity(RestaurantDTO restaurantDTO){
        Restaurant restaurant = restaurantMapper.map(restaurantDTO, Restaurant.class);
        return restaurant;
    }


}
