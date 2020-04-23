package com.miniProject.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniProject.user.entities.Location;
import com.miniProject.user.exception.UserNotFoundException;
import com.miniProject.user.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/findById/{locationId}")
	public Location getById(@PathVariable String locationId) throws UserNotFoundException
	{
		return locationService.findById(locationId);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Location location)
	{
		locationService.create(location);
	}
	
	@PutMapping("/update/{locationId}")
	public void update(@PathVariable String locationId,@RequestBody Location location) throws UserNotFoundException
	{
		locationService.update(locationId, location);
	}
}
