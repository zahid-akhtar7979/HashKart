package com.deloitte.hux.warehouse.dao;

import java.util.List;

import com.deloitte.hux.warehouse.entity.Product;

public interface ProductDao {
	
	public List<Product> findAll();   

	public Product findById(int theId);

	public void save(Product product);

	public void deleteById(int theId);
}
