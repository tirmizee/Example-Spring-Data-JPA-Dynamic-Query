package com.tirmizee.jpa.specification;

import java.util.Map;

import org.springframework.data.jpa.domain.Specification;


/**
 * @author Pratya Yeekhaday
 *
 * @param <T>
 */
public abstract class MapParameterSpecification <T> implements Specification<T> {
	
	private static final long serialVersionUID = 1L;
	
	protected Map<String, Object> mapParameter;

	public MapParameterSpecification(Map<String, Object> mapParameter) {
		this.mapParameter = mapParameter;
	}
	
}
