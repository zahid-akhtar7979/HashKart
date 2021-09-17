package com.deloitte.hux.payment.orders.dao;

import com.deloitte.hux.payment.purchase.entity.Purchase;

public interface CheckoutRepository {
	
	public Purchase placeOrder(Purchase purchase);

}
