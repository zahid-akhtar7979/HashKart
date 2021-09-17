package com.deloitte.hux.warehouse.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.hux.warehouse.dao.ProductDao;
import com.deloitte.hux.warehouse.entity.Product;
import com.deloitte.hux.warehouse.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	@Transactional
	public List<Product> findAll() {   
		
		return productDao.findAll();
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
