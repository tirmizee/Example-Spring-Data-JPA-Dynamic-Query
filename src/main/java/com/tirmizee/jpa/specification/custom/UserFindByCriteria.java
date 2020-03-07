package com.tirmizee.jpa.specification.custom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.tirmizee.jpa.entities.User;

public class UserFindByCriteria implements Specification<User> {

	private static final long serialVersionUID = 9029584193026580660L;

	@Override
	public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		return criteriaBuilder.equal(root.get("username"), "tirmizee");
	}

}
