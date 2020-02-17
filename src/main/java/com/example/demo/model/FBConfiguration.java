package com.example.demo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FBConfiguration {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
