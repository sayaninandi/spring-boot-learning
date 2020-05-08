package com.example.securitystart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller"})
public class SecurityStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityStartApplication.class, args);
	}

}
