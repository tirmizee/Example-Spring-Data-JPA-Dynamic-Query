package com.tirmizee.controller.data;

import lombok.Data;

@Data
public class UserDetailDTO {

	private Long userId;
	private String username;
	private java.sql.Date credentialsExpiredDate;
	private Boolean credentialsNonExpired;
	private Boolean accountNonExpired;
	private Boolean accountNonLocked;	
	private Boolean enabled;
	private Boolean firstLogin;
	private Integer profileId;
	private String profileImage;
	private String lastName;
	private String firstName;
	private String email;
	private String tel;
	private Integer roleId;
	private String branchName;
	private String roleName;
	private String roleCode;
	
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public boolean isFirstLogin() {
		return firstLogin;
	}
	
}
