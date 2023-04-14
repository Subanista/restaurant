package com.Restaurant.restaurant.service;

import com.Restaurant.restaurant.dto.restaurantDto;
import com.Restaurant.restaurant.dto.restaurantSaveDTO;
import com.Restaurant.restaurant.entity.restaurant;
import com.Restaurant.restaurant.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class serviceImpl implements service{
    @Autowired
    private RestaurantRepo restaurantRepo;
    @Override
    public String addRestaurant(restaurantSaveDTO restaurantSaveDTO) {
        restaurant restaurant = new restaurant(
                restaurantSaveDTO.getRestaurantname(),
                restaurantSaveDTO.getMobile(),
                restaurantSaveDTO.getAddress()
        );
        restaurantRepo.save(restaurant);
        return restaurant.getRestaurantname();
    }
}
