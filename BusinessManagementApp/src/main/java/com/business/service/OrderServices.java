package com.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.business.entities.Orders;
import com.business.entities.User;
import com.business.repositories.IOrderRepository;

@Component
public class OrderServices
{
	@Autowired
	private IOrderRepository orderRepository;

	//get all orders
	public List<Orders> getOrders()
	{
		List<Orders> list=this.orderRepository.findAll();
		return list;
	}
	//save Order
	public void saveOrder(Orders order)
	{
		this.orderRepository.save(order);
	}
	
	//update order
	public void updateOrder(int id,Orders order)
	{
		order.setOId(id);
		this.orderRepository.save(order);
		 
	}
	
	//delete order
	public void deleteOrder(int id)
	{
		this.orderRepository.deleteById(id);
	}
	
	//get Order history of user
	public List<Orders> getOrdersForUser(User user)
	{
	 return  this.orderRepository.findOrdersByUser(user);
	}
	
}
