package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendInventoryApplication.class, args);
		System.out.println("API Running on http://localhost:8080");
	}

}
