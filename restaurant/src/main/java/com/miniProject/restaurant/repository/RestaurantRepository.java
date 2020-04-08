package com.miniProject.restaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.miniProject.restaurant.entities.Restaurant;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant,String> {

}
