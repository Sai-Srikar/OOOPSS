package com.miniProject.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniProject.restaurant.entities.Item;
import com.miniProject.restaurant.exception.ItemNotFoundException;
import com.miniProject.restaurant.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Transactional
	public void createItem(Item item)
	{
		itemRepository.save(item);
	}
	
	@Transactional
	public List<Item> findAll()
	{
		return itemRepository.findAll();
	}
	
	@Transactional
	public Item findById(String itemId) throws Throwable
	{
		Item temp=(Item) itemRepository.findById(itemId).orElseThrow(()-> new ItemNotFoundException(itemId));
		return temp;
	}
	
	@Transactional
	public void update(String itemId,Item item) throws Throwable
	{
		Item temp=(Item) itemRepository.findById(itemId).orElseThrow(()-> new ItemNotFoundException(itemId));
		temp.setItemName(item.getItemName());
		temp.setPrice(item.getPrice());
		itemRepository.save(temp);
	}

}
