package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServicesProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProductServiceApplication.class, args);
		System.out.println("Done..");
	}

	@GetMapping
	public String products() {
		return "Product Service Running Successfully ....";
	}
}
