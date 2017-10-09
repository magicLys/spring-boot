package com.lys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class HellowordApplication {
	
	@RequestMapping("/sayHello")
	public String hello() {
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}

}
