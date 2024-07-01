package com.kunal.firstjobapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstjobappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstjobappApplication.class, args);
	}

}
