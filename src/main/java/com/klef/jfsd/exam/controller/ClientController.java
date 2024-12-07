package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
public class ClientController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("addorder")
	public String addOrder(@RequestBody Order o) {
		return customerService.addOrder(o);
	}
	
	@GetMapping("viewall")
	public List<Order> viewAll(){
		return customerService.viewall();
	}
}
