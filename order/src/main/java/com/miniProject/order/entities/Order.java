package com.miniProject.order.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Order")
public class Order {
	
	@Id
	private String orderId;
	private String cutomer;
	private String restuarant;
	private ArrayList<String> items;
	private String deliveryLocation;
	private String deliveryGuy;
	private boolean isRegular;
	private boolean isConfirmed;
	private int cost;
	
	public Order() {
	}

	public Order(String orderId, String cutomer, String restuarant, ArrayList<String> items, String deliveryLocation,
			String deliveryGuy, boolean isRegular, boolean isConfirmed, int cost) {
		super();
		this.orderId = orderId;
		this.cutomer = cutomer;
		this.restuarant = restuarant;
		this.items = items;
		this.deliveryLocation = deliveryLocation;
		this.deliveryGuy = deliveryGuy;
		this.isRegular = isRegular;
		this.isConfirmed = isConfirmed;
		this.cost = cost;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCutomer() {
		return cutomer;
	}

	public void setCutomer(String cutomer) {
		this.cutomer = cutomer;
	}

	public String getRestuarant() {
		return restuarant;
	}

	public void setRestuarant(String restuarant) {
		this.restuarant = restuarant;
	}

	public ArrayList<String> getItems() {
		return items;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	public String getDeliveryGuy() {
		return deliveryGuy;
	}

	public void setDeliveryGuy(String deliveryGuy) {
		this.deliveryGuy = deliveryGuy;
	}

	public boolean isRegular() {
		return isRegular;
	}

	public void setRegular(boolean isRegular) {
		this.isRegular = isRegular;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
