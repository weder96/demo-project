package com.wsousa.demoproject.repository;

import com.wsousa.demoproject.domain.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

    @Query("select r from RestaurantEntity r inner join r.kitchen k")
    List<RestaurantEntity> getAllRestaurants();
}
