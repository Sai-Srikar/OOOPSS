package com.example.gateway.responseObjects;

import java.util.ArrayList;

public class User {
	
	private String userId;
	private String name;
	private String mobileNumber;
	private String category;
	private String emailId;
	private ArrayList<String> locations;
	private ArrayList<String> favRestaurants;
	
	public User() {
		super();
	}

	public User(String userId, String name, String mobileNumber, String category, String emailId,
			ArrayList<String> locations, ArrayList<String> favRestaurants) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.category = category;
		this.emailId = emailId;
		this.locations = locations;
		this.favRestaurants = favRestaurants;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public ArrayList<String> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<String> locations) {
		this.locations = locations;
	}

	public ArrayList<String> getFavRestaurants() {
		return favRestaurants;
	}

	public void setFavRestaurants(ArrayList<String> favRestaurants) {
		this.favRestaurants = favRestaurants;
	}
}
