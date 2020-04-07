package com.miniProject.user.exception;

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException(String id) {
		super("User " + id + " not found");
    }

}
