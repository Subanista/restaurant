package com.Restaurant.restaurant.repo;


import com.Restaurant.restaurant.entity.restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface RestaurantRepo extends JpaRepository<restaurant,Integer> {
}
