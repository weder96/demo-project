package com.wsousa.demoproject.service.impl;

import com.wsousa.demoproject.domain.KitchenEntity;
import com.wsousa.demoproject.domain.Restaurant;
import com.wsousa.demoproject.dto.RestaurantDTO;
import com.wsousa.demoproject.mapper.RestaurantMapper;
import com.wsousa.demoproject.repository.RestaurantRepository;
import com.wsousa.demoproject.service.KitchenService;
import com.wsousa.demoproject.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    KitchenService kitchenService;


    @Override
    public RestaurantDTO saveRestaurant(RestaurantDTO restaurant) {
        Optional<KitchenEntity> kitchenEntity = kitchenService.findById(restaurant.getKitchenId());
        if(kitchenEntity.isPresent()) {
            Restaurant restaurant1 = RestaurantMapper.RestaurantDTOToEntity(restaurant);
            restaurant1.setKitchen(kitchenEntity.get());
            Restaurant save = restaurantRepository.save(restaurant1);
            return RestaurantMapper.entityToRestaurantDTO(save);
        }
        return null;
    }

    @Override
    public List<RestaurantDTO> getAllRestaurants() {
        List<RestaurantDTO> restaurantsDTOs = new ArrayList<>();
        List<Restaurant> restaurants = restaurantRepository.getAllRestaurants();
        restaurants.forEach(restaurant -> {
            RestaurantDTO restaurantDTO = RestaurantMapper.entityToRestaurantDTO(restaurant);
            restaurantsDTOs.add(restaurantDTO);
        });
        return restaurantsDTOs;
    }
}
