package com.Restaurant.restaurant.controller;

import com.Restaurant.restaurant.service.service;
import com.Restaurant.restaurant.dto.restaurantDto;
import com.Restaurant.restaurant.dto.restaurantSaveDTO;
import com.Restaurant.restaurant.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;

@RestController
@CrossOrigin
@RequestMapping("api/v1/restaurant")// for path
public class controller {

    @Autowired
    private service service;

    @PostMapping(path="/save")
    public String saveRestaurant(@RequestBody restaurantSaveDTO restaurantSaveDTO)
    {
String id = service.addRestaurant(restaurantSaveDTO);
return id;
    }


}
