package com.tirmizee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.repositories.UserRepository;
import com.tirmizee.jpa.specification.SearchCriteria;
import com.tirmizee.jpa.specification.custom.UserSpecifications;

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
		System.out.println(userRepository.findOne(UserSpecifications.equal(new SearchCriteria("username", null, "tirmizee"))).get());
	}

}
