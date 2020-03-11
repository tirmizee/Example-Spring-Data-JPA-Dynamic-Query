package com.tirmizee.mapper.custom;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.tirmizee.controller.data.UserDetailDTO;
import com.tirmizee.jpa.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	@Mappings({
		@Mapping(source = "profile.tel", target = "tel"),
		@Mapping(source = "profile.email", target = "email"),
		@Mapping(source = "profile.firstName", target = "firstName"),
		@Mapping(source = "profile.lastName", target = "lastName"),
		@Mapping(source = "role.roleId", target = "roleId"),
		@Mapping(source = "role.roleCode", target = "roleCode"),
		@Mapping(source = "role.roleName", target = "roleName"),
		@Mapping(source = "profile.bankBranch.branchName", target = "branchName")
	})
	UserDetailDTO toUserDetailDTO(User user);

}
