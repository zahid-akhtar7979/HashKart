package com.deloitte.hux.payment.orders.service;

import java.util.List;

import com.deloitte.hux.payment.orders.entity.Orders;

public interface OrdersService {
	
	public Orders addToCart(Orders order);
	public List<Orders> findAll(String userId);
	
}
