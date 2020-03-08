package com.tirmizee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tirmizee.jpa.repositories.RoleRepository;

@SpringBootApplication
public class ExampleSpringDataJpaDynamicQueryApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringDataJpaDynamicQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RoleRepository roleRepository = context.getBean(RoleRepository.class);
//		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		SearchCriteriaBuilder searchUserLikeBuilder = new SearchCriteriaBuilder();
//		searchUserLikeBuilder.with("username","tirmizee");
//		System.out.println(userRepository.findOne(searchUserLikeBuilder.build(UserLike.class)));
//		
//		SearchCriteriaBuilder searchUserMultiLikeBuilder = new SearchCriteriaBuilder();
//		searchUserMultiLikeBuilder.with("username","tirmizee");
//		System.out.println(userRepository.findOne(searchUserMultiLikeBuilder.build(UserMultiLike.class)));
		
		System.out.println(roleRepository.getOne(1L).getPermissions().size());
	}

}
