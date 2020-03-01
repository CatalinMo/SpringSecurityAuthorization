package ro.fortech.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ro.fortech.springsecurity.entity.EntityUser;
import ro.fortech.springsecurity.repository.EntityUserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = EntityUserRepository.class)
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EntityUserRepository entityUserRepository){
		return args -> {
			entityUserRepository.save(new EntityUser("user","pass",true,"ROLE_USER"));
			entityUserRepository.save(new EntityUser("admin","pass",true,"ROLE_ADMIN"));
		};
	}

}



