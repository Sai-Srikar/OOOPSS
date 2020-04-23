package com.example.gateway.responseObjects;

import java.util.ArrayList;

public class UserProfile {
	
	private String userId;
	private String name;
	private String mobileNumber;
	private String category;
	private String emailId;
	private ArrayList<Location> myLocations;
	private ArrayList<AllRestaurants> favRestaurants;
	
	public UserProfile() {
		super();
	}
	
	public UserProfile(String userId, String name, String mobileNumber, String category, String emailId,
			ArrayList<Location> myLocations, ArrayList<AllRestaurants> favRestaurants) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.category = category;
		this.emailId = emailId;
		this.myLocations = myLocations;
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

	public ArrayList<Location> getMyLocations() {
		return myLocations;
	}

	public void setMyLocations(ArrayList<Location> myLocations) {
		this.myLocations = myLocations;
	}

	public ArrayList<AllRestaurants> getFavRestaurants() {
		return favRestaurants;
	}

	public void setFavRestaurants(ArrayList<AllRestaurants> favRestaurants) {
		this.favRestaurants = favRestaurants;
	}
	
	

}
