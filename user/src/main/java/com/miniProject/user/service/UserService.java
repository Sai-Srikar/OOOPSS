package com.miniProject.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miniProject.user.entities.User;
import com.miniProject.user.exception.UserNotFoundException;
import com.miniProject.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Transactional
	public void createUser(User user)
	{
		userRepository.save(user);
	}
	
	@Transactional
	public List<User> allUsers()
	{
		return userRepository.findAll();
	}
	
	@Transactional
	public User findById(String userId) throws Throwable
	{
		return (User) userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
		
	}
	
	@Transactional
	public void update(String userId,User user) throws Throwable
	{
		User temp=(User) userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
		temp.setName(user.getName());
		temp.setMobileNumber(user.getMobileNumber());
		temp.setEmailId(user.getEmailId());
		temp.setCategory(user.getCategory());
		temp.setLocationId(user.getLocationId());
		userRepository.save(temp);
	}
	
	@Transactional
	public void addLocation (String userId,String locationId) throws Throwable
	{
		User temp=(User) userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
		ArrayList<String> locations=temp.getLocationId();
		locations.add(locationId);
		temp.setLocationId(locations);
		userRepository.save(temp);
	}
	
	@Transactional
	public void deleteLocation (String userId,String locationId) throws Throwable
	{
		User temp=(User) userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
		ArrayList<String> locations=temp.getLocationId();
		locations.remove(locations);
		temp.setLocationId(locations);
		userRepository.save(temp);
	}
	
	@Transactional
	public void delete(String userId)
	{
		userRepository.deleteById(userId);
	}
}
