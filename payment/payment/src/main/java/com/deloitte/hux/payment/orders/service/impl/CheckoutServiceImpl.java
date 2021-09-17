package com.deloitte.hux.payment.orders.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.deloitte.hux.payment.orders.dao.CheckoutRepository;
import com.deloitte.hux.payment.orders.service.CheckoutService;
import com.deloitte.hux.payment.purchase.entity.Purchase;

@Service
public class CheckoutServiceImpl implements CheckoutService{
	
	private CheckoutRepository checkoutRepository;

	@Override
	@Transactional
	public Purchase placeOrder(Purchase purchase) {
		
		purchase = checkoutRepository.placeOrder(purchase);
		return purchase;
	}

}
