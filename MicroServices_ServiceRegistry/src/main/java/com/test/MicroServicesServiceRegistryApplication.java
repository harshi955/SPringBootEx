package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroServicesServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesServiceRegistryApplication.class, args);
		System.out.println("Done..");
	}

}
