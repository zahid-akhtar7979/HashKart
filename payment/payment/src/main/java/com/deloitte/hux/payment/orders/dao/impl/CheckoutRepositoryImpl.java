package com.deloitte.hux.payment.orders.dao.impl;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deloitte.hux.payment.orders.dao.CheckoutRepository;
import com.deloitte.hux.payment.purchase.entity.Purchase;

@Repository
public class CheckoutRepositoryImpl implements CheckoutRepository{
	
	private EntityManager entityManager;
	
	@Autowired
	public CheckoutRepositoryImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public Purchase placeOrder(Purchase purchase) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(purchase);
		return purchase;
	}

}
