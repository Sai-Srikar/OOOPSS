package com.example.gateway.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import com.example.gateway.responseObjects.AllRestaurants;
import com.example.gateway.responseObjects.AllRestaurantsWrapper;
import com.example.gateway.responseObjects.Item;
import com.example.gateway.responseObjects.Location;
import com.example.gateway.responseObjects.Restaurant;
import com.example.gateway.responseObjects.RestaurantDisplay;
import com.example.gateway.responseObjects.User;
import com.example.gateway.responseObjects.UserProfile;

@Service
public class GatewayService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Transactional
	public ArrayList<AllRestaurants> getAllRestaurants()
	{
		ArrayList<AllRestaurants> all=new ArrayList<AllRestaurants>();
		String url="http://localhost:8081/restaurant/findAll";
		AllRestaurantsWrapper temp=restTemplate.getForObject(url, AllRestaurantsWrapper.class);
		for(Restaurant r : temp.getAllRestaurants())
		{
			AllRestaurants tempo=new AllRestaurants();
			tempo.setCostForTwo(r.getCostForTwo());
			tempo.setLikes(r.getLikes().size());
			tempo.setRestaurantID(r.getRestaurantID());
			tempo.setRestaurantName(r.getRestaurantName());
			tempo.setTime(50);
			
			url="http://localhost:8080/location/findById/"+r.getLocationId();
			Location location =restTemplate.getForObject(url,Location.class);
			tempo.setLocation(location);
			all.add(tempo);
		}
		return all;
	}
	
	@Transactional
	public RestaurantDisplay getRestaurantDetails(String restaurantId)
	{
		RestaurantDisplay temp=new RestaurantDisplay();
		String url="http://localhost:8081/restaurant/findById/"+restaurantId;
		Restaurant restaurant=restTemplate.getForObject(url, Restaurant.class);
		temp.setRestaurantID(restaurant.getRestaurantID());
		temp.setRestaurantName(restaurant.getRestaurantName());
		temp.setCostForTwo(restaurant.getCostForTwo());
		temp.setLikes(restaurant.getLikes());
		temp.setOwner(restaurant.getOwner());
		
		url="http://localhost:8080/location/findById/"+restaurant.getLocationId();
		Location location =restTemplate.getForObject(url,Location.class);
		temp.setLocation(location);
		
		ArrayList<Item> itemlist=new ArrayList<Item>();
		for(String i : restaurant.getItems())
		{
			url="http://localhost:8081/item/findById/"+i;
			Item tempo =restTemplate.getForObject(url,Item.class);
			itemlist.add(tempo);
		}
		temp.setItems(itemlist);
		
		return temp;
		
	}
	
	@Transactional
	public UserProfile getUserProfileDetails(String userId)
	{
		UserProfile temp=new UserProfile();
		String url="http://localhost:8080/user/findById/"+userId;
		User user=restTemplate.getForObject(url, User.class);
		temp.setName(user.getName());
		temp.setEmailId(user.getEmailId());
		temp.setCategory(user.getCategory());
		temp.setMobileNumber(user.getMobileNumber());
		temp.setUserId(user.getUserId());
		
		ArrayList<Location> locations=new ArrayList<Location>();
		for(String s:user.getLocations())
		{
			url="http://localhost:8080/location/findById/"+s;
			Location te=restTemplate.getForObject(url, Location.class);
			locations.add(te);
		}
		temp.setMyLocations(locations);
		
		ArrayList<AllRestaurants> favs=new ArrayList<AllRestaurants>();
		for(String s : user.getFavRestaurants())
		{
			url="http://localhost:8081/restaurant/findById/"+s;
			Restaurant res=restTemplate.getForObject(url, Restaurant.class);
			AllRestaurants tempo=new AllRestaurants();
			tempo.setRestaurantID(res.getRestaurantID());
			tempo.setCostForTwo(res.getCostForTwo());
			tempo.setLikes(res.getLikes().size());
			tempo.setRestaurantName(res.getRestaurantName());
			favs.add(tempo);
		}
		
		temp.setFavRestaurants(favs);
		
		return temp;
	}

}
