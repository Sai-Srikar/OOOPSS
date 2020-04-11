package com.miniProject.order.exception;

public class OrderNotFoundException extends Exception{
	
	public OrderNotFoundException(String id)
	{
		super("User " + id + " not found");
	}

}
