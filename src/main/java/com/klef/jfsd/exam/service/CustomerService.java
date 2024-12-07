package com.klef.jfsd.exam.service;

import java.util.List;

import com.klef.jfsd.exam.model.Order;

public interface CustomerService {
	public String addOrder(Order o);
	public List<Order> viewall();
}
