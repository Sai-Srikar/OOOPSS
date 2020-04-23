package com.example.gateway.responseObjects;

import java.util.ArrayList;

public class AllRestaurantsWrapper {
	
	private ArrayList<Restaurant> allRestaurants;

	public AllRestaurantsWrapper() {
		super();
	}

	public AllRestaurantsWrapper(ArrayList<Restaurant> allRestaurants) {
		super();
		this.allRestaurants = allRestaurants;
	}

	public ArrayList<Restaurant> getAllRestaurants() {
		return allRestaurants;
	}

	public void setAllRestaurants(ArrayList<Restaurant> allRestaurants) {
		this.allRestaurants = allRestaurants;
	}

	
	
	

}
