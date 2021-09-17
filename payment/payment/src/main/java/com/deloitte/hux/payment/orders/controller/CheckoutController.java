package com.deloitte.hux.payment.orders.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.hux.payment.orders.service.CheckoutService;
import com.deloitte.hux.payment.purchase.entity.Purchase;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
	
	private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public Purchase placeOrder(@RequestBody Purchase purchase) {

    	Purchase purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}
