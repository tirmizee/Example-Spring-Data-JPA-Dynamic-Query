package com.tirmizee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tirmizee.jpa.repositories.UserRepository;
import com.tirmizee.jpa.specification.SearchCriteriaBuilder;
import com.tirmizee.jpa.specification.custom.TestSpecification;

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
		SearchCriteriaBuilder searchCriteriaBuilder = new SearchCriteriaBuilder();
		searchCriteriaBuilder.with("username","tirmizee");
		searchCriteriaBuilder.with("username","tirmizee");
		System.out.println(userRepository.findOne(searchCriteriaBuilder.build(TestSpecification.class)).get());
//		System.out.println(userRepository.findOne(UserSpecifications.equal(new SearchCriteria("username", null, "tirmizee"))).get());
	}

}
