package com.axis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2")
public class DemoController {
	
	Logger log = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/message")
	public String getMessage() {
		
		log.error("this is error");
		log.warn("this is warn");
		
		return "this is demo controller";
	}
}
