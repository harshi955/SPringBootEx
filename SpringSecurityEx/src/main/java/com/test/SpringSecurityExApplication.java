package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@SpringBootApplication
public class SpringSecurityExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityExApplication.class, args);
		System.out.println("Done...");
	}
@GetMapping("/get")
	public String Hello() {
		return "Welcome To Spring Security ......";
	}
}
