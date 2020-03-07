package com.tirmizee.jpa.specification;

import org.springframework.data.jpa.domain.Specification;

import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.specification.custom.UserFindByCriteria;

public class UserSpecifications {

	public static Specification<User> findByCriteria() {
	    return new UserFindByCriteria();
	}
	
}
