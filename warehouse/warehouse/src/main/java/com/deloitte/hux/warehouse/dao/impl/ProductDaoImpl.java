package com.deloitte.hux.warehouse.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deloitte.hux.warehouse.dao.ProductDao;
import com.deloitte.hux.warehouse.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	
	private EntityManager entityManager;

	@Autowired
	public ProductDaoImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}


	@Override
	public List<Product> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> theQuery = currentSession.createQuery("from Product", Product.class);
		List<Product> products = theQuery.getResultList();

		return products;
	}

	@Override
	public Product findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
