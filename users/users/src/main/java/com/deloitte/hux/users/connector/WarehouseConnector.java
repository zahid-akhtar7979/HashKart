package com.deloitte.hux.users.connector;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


import reactor.core.publisher.Mono;

public class WarehouseConnector {
	
	public static String getAllProducts() {
		try {
			String url = "http://localhost:8081/warehouse/api/products";

			String responseBody = WebClient.builder().build().get().uri(url)
					.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
					.retrieve()
					.onStatus(HttpStatus::isError,
							response -> response.bodyToMono(String.class)
									.flatMap(error -> Mono.error(new RuntimeException(error))))
					.bodyToMono(String.class).block();

			//JSONObject responseObject = new JSONObject(responseBody);
			return responseBody;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String("");
	}

}
