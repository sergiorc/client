package com.sample.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * 
 * Main application startup config
 * 
 * @author SORN
 *
 */
@SpringBootApplication

public class ClientApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(ClientApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ClientApplication.class);
	}

}
