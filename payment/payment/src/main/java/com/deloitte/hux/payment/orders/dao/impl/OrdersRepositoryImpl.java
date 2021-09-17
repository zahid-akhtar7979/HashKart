package com.deloitte.hux.payment.orders.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deloitte.hux.payment.orders.dao.OrdersRepository;
import com.deloitte.hux.payment.orders.entity.Orders;

@Repository
public class OrdersRepositoryImpl implements OrdersRepository{

	private EntityManager entityManager;

	@Autowired
	public OrdersRepositoryImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	@Override
	public Orders addToCart(Orders order) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(order);
		
		return order;
	}

	@Override
	public List<Orders> findAll(String userId) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Orders> theQuery = currentSession.createQuery("from Orders", Orders.class);
		List<Orders> ordersList = theQuery.getResultList();
		
		return ordersList;
	}

}
