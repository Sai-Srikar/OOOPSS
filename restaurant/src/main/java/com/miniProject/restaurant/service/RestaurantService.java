package com.miniProject.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miniProject.restaurant.entities.Restaurant;
import com.miniProject.restaurant.exception.RestaurantNotFoundException;
import com.miniProject.restaurant.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Transactional
	public void createRestaurant(Restaurant restaurant)
	{
		restaurantRepository.save(restaurant);
	}

	@Transactional
	public List<Restaurant> findAll()
	{
		return restaurantRepository.findAll();
	}
	
	@Transactional
	public Restaurant findById(String restaurantId) throws Throwable
	{
		Restaurant temp=(Restaurant) restaurantRepository.findById(restaurantId).orElseThrow(()-> new RestaurantNotFoundException(restaurantId));
		return temp;
	}
	
	@Transactional
	public void update (String restaurantId, Restaurant restaurant) throws Throwable
	{
		Restaurant temp=(Restaurant) restaurantRepository.findById(restaurantId).orElseThrow(()-> new RestaurantNotFoundException(restaurantId));
		temp.setOwner(restaurant.getOwner());
		temp.setItems(restaurant.getItems());
		temp.setLocationId(restaurant.getLocationId());
		temp.setRestaurantName(restaurant.getRestaurantName());
		restaurantRepository.save(temp);
	}
	
	@Transactional
	public void addItem (String restaurantId, String itemId) throws Throwable
	{
		Restaurant temp=(Restaurant) restaurantRepository.findById(restaurantId).orElseThrow(()-> new RestaurantNotFoundException(restaurantId));
		ArrayList<String> tempo=temp.getItems();
		tempo.add(itemId);
		temp.setItems(tempo);
		restaurantRepository.save(temp);
	}
	
	@Transactional
	public void deleteItem (String restaurantId, String itemId) throws Throwable
	{
		Restaurant temp=(Restaurant) restaurantRepository.findById(restaurantId).orElseThrow(()-> new RestaurantNotFoundException(restaurantId));
		ArrayList<String> tempo=temp.getItems();
		tempo.remove(itemId);
		temp.setItems(tempo);
		restaurantRepository.save(temp);
	}
}
