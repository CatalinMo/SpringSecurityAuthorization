package com.example.App1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App1Application {

	@GetMapping("/")
	String getApp1(){return "Hello App1";}

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}

}
