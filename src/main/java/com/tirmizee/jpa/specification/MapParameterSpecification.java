package com.tirmizee.jpa.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;


/**
 * @author Pratya Yeekhaday
 *
 * @param <T>
 */
public abstract class MapParameterSpecification <T> implements Specification<T> {
	
	private static final long serialVersionUID = 1L;
	
	protected Map<String, Object> mapParameter;
	protected List<Predicate> predicates;

	public MapParameterSpecification(Map<String, Object> mapParameter) {
		this.mapParameter = mapParameter;
		this.predicates = new ArrayList<Predicate>();
	}
	
}
