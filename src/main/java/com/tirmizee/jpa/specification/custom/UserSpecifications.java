package com.tirmizee.jpa.specification.custom;

import org.springframework.data.jpa.domain.Specification;

import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.specification.SearchCriteria;

public class UserSpecifications {

	public static Specification<User> equal(SearchCriteria criteria) {
		return (root, query, cb) -> { 
	        return cb.equal(root.<String>get(criteria.getKey()), criteria.getValue());
	    };
	}
	
	public static Specification<User> like(SearchCriteria criteria) {
		return (root, query, cb) -> { 
	        return cb.like(root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
	    };
	}
	
}
