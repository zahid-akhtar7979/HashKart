package com.deloitte.hux.warehouse.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;   

import com.deloitte.hux.warehouse.entity.Product;
import com.deloitte.hux.warehouse.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	private ProductService productService;

	@Autowired
	public ProductRestController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/products")
	public List<Product> findAll() {
		return productService.findAll();
	}
	
	@GetMapping("/product/{id}")
	public List<Product> findById() {
		return productService.findAll();
	}

}
