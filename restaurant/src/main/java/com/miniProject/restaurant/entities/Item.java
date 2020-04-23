package com.miniProject.restaurant.entities;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("item")
public class Item {
	
	@Id
	private String itemID;
	private String itemName;
	private int price;
	
	public Item() {
		super();
	}
	
	public Item(String itemID, String itemName, int price) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
	}
	
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
