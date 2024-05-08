package com.dakr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AppTwoRestController {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showB")
	public String showB() {
		
		log.info("WELCOME TO SERVICE#2");
		String resp=rt.getForObject("http://localhost:8083/showC", String.class);
		log.info("BACK TO SERVICE#2, msg is {} ",resp);
		return "FROM SHOW B =>"+resp;
		
	}

}
