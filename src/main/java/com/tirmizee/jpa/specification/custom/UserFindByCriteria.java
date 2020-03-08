package com.tirmizee.jpa.specification.custom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.tirmizee.controller.data.UserDetailSearchDTO;
import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.specification.SearchBodySpecification;

public class UserFindByCriteria extends SearchBodySpecification<UserDetailSearchDTO, User> {

	public UserFindByCriteria(UserDetailSearchDTO serachBody) {
		super(serachBody);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		return null;
	}

}
