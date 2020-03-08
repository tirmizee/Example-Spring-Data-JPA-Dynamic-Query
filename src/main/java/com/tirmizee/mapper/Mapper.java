package com.tirmizee.mapper;

import java.util.List;

public interface Mapper <D, E> {
	
	E toEntity(D dto);
	
	D toDTO(E entity);
	
	List<E> toEntity(List<D> dtos);
	
	List<D> toDTO(List<E> entities);
	
}

