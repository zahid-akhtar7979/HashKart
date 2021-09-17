package com.deloitte.hux.payment.orders.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders_product_mapping")
public class OrdersProductMapping {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name = "product_id")
	private Long productId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public OrdersProductMapping() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
