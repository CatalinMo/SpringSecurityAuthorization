package ro.fortech.App2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App2Application {

	@GetMapping("/app2")
	String getApp1(){return "Greetings App2";}

	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}

}
