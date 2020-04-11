package com.miniProject.user.entities;

import java.util.ArrayList;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
public class User {
	
	@Id
	private String userId;
	private String name;
	private String mobileNumber;
	private String category;
	private String emailId;
	private ArrayList<String> locationId;
	
	public User() {
	}

	public User(String userId, String name, String mobileNumber, String category, String emailId,
			ArrayList<String> locationId) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.category = category;
		this.emailId = emailId;
		this.locationId = locationId;
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

	public ArrayList<String> getLocationId() {
		return locationId;
	}

	public void setLocationId(ArrayList<String> locationId) {
		this.locationId = locationId;
	}

}
