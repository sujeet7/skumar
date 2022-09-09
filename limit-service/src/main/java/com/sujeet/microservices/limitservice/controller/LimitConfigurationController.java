package com.sujeet.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujeet.microservices.limitservice.model.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private LimitConfiguration limitConfiguration;	

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimits() {
		return new LimitConfiguration(limitConfiguration.getMaxLimit(),limitConfiguration.getMinLimit());
		
	}

}
