package com.deloitte.hux.payment.orders.service;

import com.deloitte.hux.payment.purchase.entity.Purchase;

public interface CheckoutService {
	
	public Purchase placeOrder(Purchase purchase);

}
