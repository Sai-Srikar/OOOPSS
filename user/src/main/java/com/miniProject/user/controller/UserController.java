package com.miniProject.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniProject.user.entities.User;
import com.miniProject.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/Create")
	public void createUser(@RequestBody User user)
	{
		userService.createUser(user);
	}
	
	@GetMapping("/findAll")
	public List<User> findAllUsers()
	{
		return userService.allUsers();
	}
	
	@GetMapping("/findById/{userId}")
	public User findById(@PathVariable String userId) throws Throwable
	{
		return userService.findById(userId);
	}
	
	@PutMapping("/update/{userId}")
	public void update(@PathVariable String userId,@RequestBody User user) throws Throwable
	{
		userService.update(userId,user);
	}
	
	@PutMapping("/addLocation/{userId}")
	public void addLocation(@PathVariable String userId,@RequestBody String locationId) throws Throwable
	{
		userService.addLocation(userId, locationId);
	}
	
	@PutMapping("/deleteLocation/{userId}")
	public void deleteLocation(@PathVariable String userId,@RequestBody String locationId) throws Throwable
	{
		userService.deleteLocation(userId, locationId);
	}
}
