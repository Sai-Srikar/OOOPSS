package com.miniProject.restaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.miniProject.restaurant.entities.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item,String>{

}
