package com.wsousa.demoproject.repository;

import com.wsousa.demoproject.domain.Restaurant;
import com.wsousa.demoproject.dto.RestaurantDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query("select r from Restaurant r inner join r.kitchen k")
    List<Restaurant> getAllRestaurants();
}
