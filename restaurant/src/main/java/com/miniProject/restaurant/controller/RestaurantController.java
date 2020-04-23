package com.miniProject.restaurant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniProject.restaurant.entities.Restaurant;
import com.miniProject.restaurant.exception.RestaurantNotFoundException;
import com.miniProject.restaurant.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;
	
	@PostMapping("/create")
	public void createRestaurant(Restaurant restaurant)
	{
		restaurantService.createRestaurant(restaurant);
	}
	
	@GetMapping("/findAll")
	public List<Restaurant> findAll()
	{
		return restaurantService.findAll();
	}
	
	@GetMapping("/findById/{restaurantId}")
	public Restaurant findById(@PathVariable String restaurantId) throws Throwable
	{
		return restaurantService.findById(restaurantId);
	}
	
	@PutMapping("/update/{restaurantId}")
	public void update(@PathVariable String restaurantId,@RequestBody Restaurant restaurant) throws Throwable
	{
		restaurantService.update(restaurantId,restaurant);
	}
	
	@PutMapping("/addItem/{restaurantId}")
	public void addItem(@PathVariable String restaurantId,@RequestBody String itemId) throws Throwable
	{
		restaurantService.addItem(restaurantId, itemId);
	}
	
	@PutMapping("/deleteItem/{restaurantId}")
	public void deleteItem(@PathVariable String restaurantId,@RequestBody String itemId) throws Throwable
	{
		restaurantService.deleteItem(restaurantId, itemId);
	}
	
	@PutMapping("/updateLike/{restaurantId}")
	public void updateLike(@PathVariable String restaurantId,@RequestBody String userId) throws RestaurantNotFoundException
	{
		restaurantService.updateLike(restaurantId, userId);
	}
}
