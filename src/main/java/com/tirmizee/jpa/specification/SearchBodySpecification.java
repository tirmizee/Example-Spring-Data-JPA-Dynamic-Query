package com.tirmizee.jpa.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;


/**
 * @author Pratya Yeekhaday
 *
 * @param <B> Object type to search
 * @param <T> Domain object
 */
public abstract class SearchBodySpecification<B, T> implements Specification<T> {

	private static final long serialVersionUID = 1L;
	
	protected B serachBody;
	protected List<Predicate> predicates;
	
	public SearchBodySpecification(B serachBody) {
		this.serachBody = serachBody;
		this.predicates = new ArrayList<Predicate>();
	}
	
}
