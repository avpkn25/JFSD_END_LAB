package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public String addOrder(Order o) {
		orderRepository.save(o);
		return "Order Added Successfully";
	}

	@Override
	public List<Order> viewall() {
		return (List<Order>)orderRepository.findAll();
	}

}
