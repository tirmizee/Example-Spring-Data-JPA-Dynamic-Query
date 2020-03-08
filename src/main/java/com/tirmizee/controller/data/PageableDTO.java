package com.tirmizee.controller.data;

import lombok.Data;

@Data
public class PageableDTO {
	
	private String sort;
	private Integer page = 0;
	private Integer size = 10;

}
