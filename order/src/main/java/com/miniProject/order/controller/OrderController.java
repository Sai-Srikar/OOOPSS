package com.miniProject.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniProject.order.entities.Order;
import com.miniProject.order.exception.OrderNotFoundException;
import com.miniProject.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@PostMapping("/create")
	public void create(@RequestBody Order order)
	{
		orderService.create(order);
	}
	
	@GetMapping("/findAll")
	public List<Order> findAll()
	{
		return orderService.findAll();
	}
	
	@GetMapping("/findById/{orderId}")
	public Order findById(@PathVariable String orderId) throws OrderNotFoundException
	{
		return orderService.findById(orderId);
	}
	
	@PutMapping("/update/{orderId}")
	public void update(@PathVariable String orderId,@RequestBody Order order) throws OrderNotFoundException
	{
		orderService.update(orderId, order);
	}
	
	@PutMapping("/setConfirmed/{orderId}")
	public void setConfirmed(@PathVariable String orderId,@RequestBody boolean isConfirmed) throws OrderNotFoundException
	{
		orderService.setConfirmed(orderId, isConfirmed);
	}
	
	@PutMapping("/setDeliveryGuy/{orderId}")
	public void setDeliveryGuy(@PathVariable String orderId, @RequestBody String deliveryGuy) throws OrderNotFoundException
	{
		orderService.setDeliveryGuy(orderId, deliveryGuy);
	}
}
