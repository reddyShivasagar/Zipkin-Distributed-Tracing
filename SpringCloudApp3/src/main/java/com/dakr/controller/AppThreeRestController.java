package com.dakr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AppThreeRestController {

	@GetMapping("/showC")
	public String showC() {
		log.info("FROM SERVICE#3");
		log.info("BYE FROM SERVICE#3");
		return "FROM C";
		
	}
}
