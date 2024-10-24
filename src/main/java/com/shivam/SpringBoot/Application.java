package com.shivam.SpringBoot;

import com.shivam.SpringBoot.models.Author;
import com.shivam.SpringBoot.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository
	){
		return args -> {
//			var author = Author.class.
//					.firstName("shivam")
//					.lastName("shankhdhar")
//					.age(24)
//					.email("s.shankhdhar1981@gmail.com")
//					.build();
//			authorRepository.save(author);


		};
	}
}
