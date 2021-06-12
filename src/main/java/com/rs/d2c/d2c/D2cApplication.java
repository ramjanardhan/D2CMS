package com.rs.d2c.d2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class D2cApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2cApplication.class, args);
	}
	
	@RequestMapping("/")
	public String starter()
	{
		return "Hello Welcome to the Azure Devops with Kubernetes";
	}

}
