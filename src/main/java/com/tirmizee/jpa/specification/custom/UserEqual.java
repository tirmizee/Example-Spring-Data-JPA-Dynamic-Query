package com.tirmizee.jpa.specification.custom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.specification.SearchCriteria;

public class UserEqual implements Specification<User> {

	private static final long serialVersionUID = 9029584193026580660L;
	
	private SearchCriteria searchCriteria;
	
	public UserEqual(SearchCriteria searchCriteria) {
		super();
		this.searchCriteria = searchCriteria;
	}

	@Override
	public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		return criteriaBuilder.equal(root.<String>get(searchCriteria.getKey()), searchCriteria.getValue());
	}

}
