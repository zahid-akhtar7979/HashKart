package com.deloitte.hux.payment.orders.dao;

import java.util.List;

import com.deloitte.hux.payment.orders.entity.Orders;

public interface OrdersRepository {

	public Orders addToCart(Orders order);
	public List<Orders> findAll(String userId);
}
