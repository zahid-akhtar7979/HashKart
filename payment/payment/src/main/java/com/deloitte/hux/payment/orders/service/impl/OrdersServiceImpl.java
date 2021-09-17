package com.deloitte.hux.payment.orders.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.hux.payment.orders.dao.OrdersRepository;
import com.deloitte.hux.payment.orders.entity.Orders;
import com.deloitte.hux.payment.orders.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Override
	@Transactional
	public Orders addToCart(Orders order) {
		
		Orders orders = ordersRepository.addToCart(order);
		return orders;
	}

	@Override
	@Transactional
	public List<Orders> findAll(String userId) {
		
		List<Orders> ordersList = ordersRepository.findAll(userId);
		return ordersList;
	}

}
