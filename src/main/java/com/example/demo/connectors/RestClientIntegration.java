package com.example.demo.connectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientIntegration {
	
	@Autowired
	private RestTemplate restTemplate;
	
    public String getResponse(final String url) {
        return restTemplate.getForObject(url, String.class);
    }
}
