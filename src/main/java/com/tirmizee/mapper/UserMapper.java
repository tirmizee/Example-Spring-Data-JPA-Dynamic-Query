package com.tirmizee.mapper;

import org.mapstruct.Mapper;

import com.tirmizee.controller.data.UserDetailDTO;
import com.tirmizee.jpa.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	UserDetailDTO tUserDetailDTO(User user);

}
