package com.dbdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Radhe Krishna...!";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hello From JAVA CICD...!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
