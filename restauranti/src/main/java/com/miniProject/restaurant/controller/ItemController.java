package com.miniProject.restaurant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniProject.restaurant.entities.Item;
import com.miniProject.restaurant.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/create")
	public void CreateItem(@RequestBody Item item)
	{
		itemService.createItem(item);
	}
	
	@GetMapping("/findAll")
	public List<Item> findAll()
	{
		return itemService.findAll();
	}
	
	@GetMapping("/findById/{itemId}")
	public Item findById(@PathVariable String itemId) throws Throwable
	{
		return itemService.findById(itemId);
	}
	
	@PutMapping("/update/{itemId}")
	public void update(@PathVariable String itemId, @RequestBody Item item) throws Throwable
	{
		itemService.update(itemId, item);
	}

}
