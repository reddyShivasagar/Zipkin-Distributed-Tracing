package com.dakr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AppOneRestController {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showA")
	public String showA() {
		
		log.info("WELCOME TO SERVICE#1");
		String resp=rt.getForObject("http://localhost:8082/showB", String.class);
		log.info("BACK TO SERVICE#1,Data is {}",resp);
		
		return "DONE";
		
	}

}
