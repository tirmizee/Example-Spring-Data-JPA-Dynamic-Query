package com.tirmizee.jpa.specification.custom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.specification.SearchCriteria;
import com.tirmizee.jpa.specification.SearchSpecification;

public class UserLike extends SearchSpecification<User>{

	private static final long serialVersionUID = 1L;

	public UserLike(SearchCriteria searchCriteria) {
		super(searchCriteria);
	}

	@Override
	public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		return criteriaBuilder.like(root.<String>get(searchCriteria.getKey()), "%" + searchCriteria.getValue() + "%");
	}

}
