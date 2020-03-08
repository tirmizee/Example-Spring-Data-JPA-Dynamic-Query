package com.tirmizee.jpa.specification;

import org.springframework.data.jpa.domain.Specification;


/**
 * @author Pratya Yeekhaday
 *
 * @param <B> Search body
 * @param <T> Domain object
 */
public abstract class SearchBodySpecification<B, T> implements Specification<T> {

	private static final long serialVersionUID = 1L;
	
	protected B serachBody;

	public SearchBodySpecification(B serachBody) {
		this.serachBody = serachBody;
	}
	
}
