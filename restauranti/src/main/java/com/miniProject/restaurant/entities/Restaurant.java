package com.miniProject.restaurant.entities;

import java.util.ArrayList;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Restaurant {
	
	@org.springframework.data.annotation.Id
	private String restaurantID;
	private String restaurantName;
	private ArrayList<String> items;
	private String locationId;
	private String owner;
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(String restaurantID, String restaurantName, ArrayList<String> items, String locationId,
			String owner) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.items = items;
		this.locationId = locationId;
		this.owner = owner;
	}
	
	public String getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(String restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public ArrayList<String> getItems() {
		return items;
	}
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
