package com.example.App2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App2Application {

	@GetMapping("/")
	String getApp1(){return "Hello App2";}

	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}

}
