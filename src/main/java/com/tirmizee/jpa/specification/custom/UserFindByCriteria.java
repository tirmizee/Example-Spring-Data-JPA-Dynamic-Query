package com.tirmizee.jpa.specification.custom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.tirmizee.controller.data.UserDetailSearchDTO;
import com.tirmizee.jpa.entities.Profile;
import com.tirmizee.jpa.entities.Role;
import com.tirmizee.jpa.entities.User;
import com.tirmizee.jpa.specification.SearchBodySpecification;
import com.tirmizee.utils.StringUtils;

public class UserFindByCriteria extends SearchBodySpecification<UserDetailSearchDTO, User> {

	private static final long serialVersionUID = 1L;
	
	public UserFindByCriteria(UserDetailSearchDTO serachBody) {
		super(serachBody);
	}

	@Override
	public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		
		Join<User, Profile> profile = root.join("profile", JoinType.INNER);
		Join<User, Role> role = root.join("role", JoinType.INNER);
//		Join<Role, Permission> permission = role.join("permissions", JoinType.INNER);
		
		if (serachBody.getUsername() != null) {
			predicates.add(criteriaBuilder.like(root.<String>get("username"), "%" + StringUtils.trimToEmpty(serachBody.getUsername()) + "%"));
		}
		
		if (serachBody.getEmail() != null) {
			predicates.add(criteriaBuilder.like(profile.<String>get("email"), "%" + StringUtils.trimToEmpty(serachBody.getEmail()) + "%"));
		}
		
		if (serachBody.getFirstName() != null) {
			predicates.add(criteriaBuilder.like(profile.<String>get("firstName"), "%" + StringUtils.trimToEmpty(serachBody.getFirstName()) + "%"));
		}
		
		if (serachBody.getLastName() != null) {
			predicates.add(criteriaBuilder.like(profile.<String>get("lastName"), "%" + StringUtils.trimToEmpty(serachBody.getLastName()) + "%"));
		}
		
		if (serachBody.getTel() != null) {
			predicates.add(criteriaBuilder.like(profile.<String>get("tel"), "%" + StringUtils.trimToEmpty(serachBody.getTel()) + "%"));
		}
		
		if (serachBody.getRoleId() != null) {
			predicates.add(criteriaBuilder.equal(role.<Integer>get("roleId"), serachBody.getRoleId()));
		}
		
		return super.buildPredicate(root, query, criteriaBuilder);
	}

}
