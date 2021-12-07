package com.wsousa.demoproject.controller;

import com.wsousa.demoproject.domain.Employee;
import com.wsousa.demoproject.domain.Restaurant;
import com.wsousa.demoproject.dto.RestaurantDTO;
import com.wsousa.demoproject.exceptions.RestaurantException;
import com.wsousa.demoproject.mapper.RestaurantMapper;
import com.wsousa.demoproject.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
@RequestMapping("/api/restaurants")
public class RestaurantController {
    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<RestaurantDTO> index(){
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<RestaurantDTO> restaurantSave(@Valid @RequestBody RestaurantDTO restaurant){
        RestaurantDTO restaurantSave = restaurantService.saveRestaurant(restaurant);
        return ResponseEntity.ok(restaurantSave);
    }

    @PostMapping("/save/test")
    @ResponseBody
    public ResponseEntity<String> restaurantSaveException(@RequestBody RestaurantDTO restaurant){
        if(restaurant.getId() == null)
            throw new RestaurantException("Erro message");
        return ResponseEntity.ok("");
    }
}
