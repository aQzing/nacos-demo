package com.qzing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/hi-resttemplate")
	public String hiResttemplate() {
		return restTemplate.getForObject("http://nacos-provider/hi?name=qzing", String.class);
	}
}
