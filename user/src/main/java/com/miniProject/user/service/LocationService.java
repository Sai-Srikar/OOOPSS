package com.miniProject.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miniProject.user.entities.Location;
import com.miniProject.user.exception.UserNotFoundException;
import com.miniProject.user.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Transactional
	public void create(Location location)
	{
		locationRepository.save(location);
	}
	
	@Transactional
	public Location findById(String locationId) throws UserNotFoundException
	{
		return (Location) locationRepository.findById(locationId).orElseThrow(() -> new UserNotFoundException(locationId));
	}
	
	@Transactional
	public void update(String locationId,Location location) throws UserNotFoundException
	{
		Location temp=(Location) locationRepository.findById(locationId).orElseThrow(() -> new UserNotFoundException(locationId));
		temp.setCategory(location.getCategory());
		temp.setFlatNo(location.getFlatNo());
		temp.setLandMark(location.getLandMark());
		temp.setLatitude(location.getLatitude());
		temp.setLongitude(location.getLongitude());
		locationRepository.save(temp);
	}

}
