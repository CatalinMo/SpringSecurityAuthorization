package com.example.App3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App3Application {

	@GetMapping("/")
	String getApp1() {return "Hello app3"; }

	public static void main(String[] args) {
		SpringApplication.run(App3Application.class, args);
	}

}
