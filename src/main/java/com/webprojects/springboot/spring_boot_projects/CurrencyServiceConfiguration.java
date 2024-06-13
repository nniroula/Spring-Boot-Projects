package com.webprojects.springboot.spring_boot_projects;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String key;

	// getters and setters
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
	//constructor
	public CurrencyServiceConfiguration(String url, String username, String key) {
		super();
		this.url = url;
		this.username = username;
		this.key = key;
	}
	
	// to fix the error of parameter 0 of constructor in ... required a bean of type java.lang.String that could not be found
	public CurrencyServiceConfiguration(){
	}

}
