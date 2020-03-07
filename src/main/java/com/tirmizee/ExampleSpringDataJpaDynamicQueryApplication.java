package com.tirmizee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.repositories.UserRepository;

@SpringBootApplication
public class ExampleSpringDataJpaDynamicQueryApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringDataJpaDynamicQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = userRepository.getOne(278L);
		System.out.println(user.getRole());
	}

}
