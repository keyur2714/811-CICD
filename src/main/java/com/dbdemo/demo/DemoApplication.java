package com.dbdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Radhe Krishna...!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
