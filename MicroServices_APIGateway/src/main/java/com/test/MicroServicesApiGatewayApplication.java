package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServicesApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApiGatewayApplication.class, args);
		System.out.println("Done..");
	}

}
