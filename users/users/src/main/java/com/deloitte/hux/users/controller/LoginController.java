package com.deloitte.hux.users.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.hux.users.connector.WarehouseConnector;


@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	
	@RequestMapping("/products")
    public String welcome() {
		
       String responseBody =  WarehouseConnector.getAllProducts();
        return responseBody;
    }
}
