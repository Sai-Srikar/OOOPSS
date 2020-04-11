package com.miniProject.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miniProject.order.entities.Order;
import com.miniProject.order.exception.OrderNotFoundException;
import com.miniProject.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Transactional
	public void create(Order order)
	{
		orderRepository.save(order);
	}
	
	@Transactional
	public List<Order> findAll()
	{
		return orderRepository.findAll();
	}
	
	@Transactional
	public Order findById(String orderId) throws OrderNotFoundException 
	{
		return (Order) orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException(orderId));
		
	}
	
	@Transactional
	public void update(String orderId, Order order) throws OrderNotFoundException
	{
		Order temp= (Order) orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException(orderId));
		temp.setConfirmed(order.isConfirmed());
		temp.setRegular(order.isRegular());
		temp.setRestuarant(order.getRestuarant());
		temp.setCutomer(order.getCutomer());
		temp.setDeliveryGuy(order.getDeliveryGuy());
		temp.setItems(order.getItems());
		temp.setCost(order.getCost());
		temp.setDeliveryLocation(order.getDeliveryLocation());
		
		orderRepository.save(temp);
	}
	
	@Transactional
	public void setConfirmed(String orderId ,boolean isConfirmed) throws OrderNotFoundException
	{
		Order temp= (Order) orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException(orderId));
		temp.setConfirmed(isConfirmed);
		orderRepository.save(temp);
	}
	
	@Transactional
	public void setDeliveryGuy(String orderId,String deliveryGuy) throws OrderNotFoundException
	{
		Order temp= (Order) orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException(orderId));
		temp.setDeliveryGuy(deliveryGuy);
		orderRepository.save(temp);
	}

}
