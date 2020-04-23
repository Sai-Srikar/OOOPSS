 package com.example.gateway.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.gateway.responseObjects.AllRestaurants;
import com.example.gateway.responseObjects.RestaurantDisplay;
import com.example.gateway.service.GatewayService;

@RestController
@RequestMapping("/gateway")
public class GatewayController {
	
	@Autowired
	private GatewayService gatewayService;
	
	@GetMapping("/restaurant/all")
	public ArrayList<AllRestaurants> getRestaurants()
	{
		return gatewayService.getAllRestaurants();
	}
	
	@GetMapping("/restaurant/{restaurantId}")
	public RestaurantDisplay getRestaurantDetails(@PathVariable String restaurantId)
	{
		return gatewayService.getRestaurantDetails(restaurantId);
	}
	

}
