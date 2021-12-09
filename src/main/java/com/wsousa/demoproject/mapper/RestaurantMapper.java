package com.wsousa.demoproject.mapper;

import com.wsousa.demoproject.domain.RestaurantEntity;
import com.wsousa.demoproject.dto.RestaurantDTO;
import org.modelmapper.ModelMapper;

public class RestaurantMapper {
    private static final ModelMapper restaurantMapper = new ModelMapper();

    public static RestaurantDTO entityToRestaurantDTO(RestaurantEntity restaurant){
        RestaurantDTO restaurantDTO = restaurantMapper.map(restaurant, RestaurantDTO.class);
        return restaurantDTO;
    }

    public static RestaurantEntity RestaurantDTOToEntity(RestaurantDTO restaurantDTO){
        RestaurantEntity restaurant = restaurantMapper.map(restaurantDTO, RestaurantEntity.class);
        return restaurant;
    }


}
