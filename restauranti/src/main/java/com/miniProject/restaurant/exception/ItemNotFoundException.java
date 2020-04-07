package com.miniProject.restaurant.exception;

public class ItemNotFoundException extends Exception{
	
	public ItemNotFoundException(String itemId)
	{
		super("Item " + itemId + " not found");
	}

}
