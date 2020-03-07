package com.tirmizee.jpa.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

public class SearchCriteriaBuilder {
	
	private List<SearchCriteria> searchCriterias;

	public SearchCriteriaBuilder() {
		this.searchCriterias = new ArrayList<SearchCriteria>();
	}
	
	public SearchCriteriaBuilder(List<SearchCriteria> searchCriterias) {
		this.searchCriterias = searchCriterias;
	}
	
	public SearchCriteriaBuilder with(String key, Object value) {
		searchCriterias.add(new SearchCriteria(key, null, value));
		return this;
	}
	
	public SearchCriteriaBuilder with(String key,String operation, Object value) {
		searchCriterias.add(new SearchCriteria(key, operation, value));
		return this;
	}
	
	public SearchCriteriaBuilder with(SearchCriteria searchCriteria) {
		searchCriterias.add(searchCriteria);
		return this;
	}
	
	public Specification<?> build(){
		return null;
	}
	
}
