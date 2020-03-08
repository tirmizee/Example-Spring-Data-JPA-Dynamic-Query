package com.tirmizee.controller.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class UserDetailSearchDTO extends PageableDTO {
	
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String tel;
	private Integer roleId;
	
}
