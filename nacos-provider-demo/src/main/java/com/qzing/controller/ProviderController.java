package com.qzing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
	@Value("${server.port}")
	private String port;

	@GetMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name) {

		return "hi " + name+",来自端口："+port;
	}
}
