package com.example.gateway.responseObjects;

public class AllRestaurants {
	
	private String restaurantID;
	private String restaurantName;
	private int costForTwo;
	private int likes;
	private Location location;
	private int time;
	
	public AllRestaurants() {
		super();
	}

	public AllRestaurants(String restaurantID, String restaurantName, int costForTwo, int likes, Location location,
			int time) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.costForTwo = costForTwo;
		this.likes = likes;
		this.location = location;
		this.time = time;
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

	public int getCostForTwo() {
		return costForTwo;
	}

	public void setCostForTwo(int costForTwo) {
		this.costForTwo = costForTwo;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
