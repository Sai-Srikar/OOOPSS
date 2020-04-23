package com.example.gateway.responseObjects;

import java.util.ArrayList;

public class RestaurantDisplay {

	private String restaurantID;
	private String restaurantName;
	private ArrayList<Item> items;
	private Location location;
	private String owner;
	private int costForTwo;
	private ArrayList<String> likes;
	
	public RestaurantDisplay() {
		super();
	}
	
	public RestaurantDisplay(String restaurantID, String restaurantName, ArrayList<Item> items, Location location,
			String owner, int costForTwo, ArrayList<String> likes) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.items = items;
		this.location = location;
		this.owner = owner;
		this.costForTwo = costForTwo;
		this.likes = likes;
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

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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
	
}
