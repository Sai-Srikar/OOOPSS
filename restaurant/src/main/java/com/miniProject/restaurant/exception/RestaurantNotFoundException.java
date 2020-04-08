package com.miniProject.restaurant.exception;

public class RestaurantNotFoundException extends Exception {
	
	public RestaurantNotFoundException(String restaurantId)
	{
		super("Restaurant " + restaurantId + " not found");
	}

}
