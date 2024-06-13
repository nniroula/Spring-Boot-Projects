package com.webprojects.springboot.spring_boot_projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//make this a controller

@RestController
public class CurrencyConfigurationController {
	
	// method to make an api endpoint(api url)
	//auto wire the dependency
	
	@Autowired
	private CurrencyServiceConfiguration configuration; // spring creates an instance, you autowire it and return it here
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration getAllConfigs() {
		return configuration;
	}

}
