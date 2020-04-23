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
	private int costForTwo;
	private ArrayList<String> likes;
	private String owner;
	
	public Restaurant() {
		super();
	}

	public Restaurant(String restaurantID, String restaurantName, ArrayList<String> items, String locationId,
			int costForTwo, ArrayList<String> likes, String owner) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.items = items;
		this.locationId = locationId;
		this.costForTwo = costForTwo;
		this.likes = likes;
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

	public int getCostForTwo() {
		return costForTwo;
	}

	public void setCostForTwo(int costForTwo) {
		this.costForTwo = costForTwo;
	}

	public ArrayList<String> getLikes() {
		return likes;
	}

	public void setLikes(ArrayList<String> likes) {
		this.likes = likes;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
