package com.deloitte.hux.payment.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.hux.payment.orders.entity.Orders;
import com.deloitte.hux.payment.orders.service.OrdersService;

@RestController
@CrossOrigin(origins = "*")
public class OrderController {
	
	@Autowired
	OrdersService ordersService;
	
	
	@PostMapping("/orders")
	public Orders addToCart(@RequestParam Orders orders) {
		return ordersService.addToCart(orders);
	}
	
	
	@GetMapping("/orders")
	public List<Orders> findAll(@RequestParam String userId) {
		return ordersService.findAll(userId);
	}
	

}
