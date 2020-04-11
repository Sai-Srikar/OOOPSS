package com.miniProject.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.miniProject.order.entities.Order;

public interface OrderRepository extends MongoRepository<Order,String> {

}
