package ro.fortech.App1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App1Application {

	@GetMapping("/app1")
	String getApp1(){return "Hello App1";}

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}

}
