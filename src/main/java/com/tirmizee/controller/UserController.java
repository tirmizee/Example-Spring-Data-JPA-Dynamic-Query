package com.tirmizee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tirmizee.controller.data.UserDetailDTO;
import com.tirmizee.controller.data.UserDetailSearchDTO;
import com.tirmizee.jpa.repositories.UserRepository;
import com.tirmizee.jpa.specification.custom.UserFindByCriteria;
import com.tirmizee.mapper.UserMapper;

@RestController
@RequestMapping(path = "/users")
public class UserController extends ApiController {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/page")
	public Page<UserDetailDTO> paging(UserDetailSearchDTO search){
		Pageable pageable = PageRequest.of(search.getPage(), search.getSize());
		UserFindByCriteria userFindByCriteria = new UserFindByCriteria(search);
		Page<UserDetailDTO> page = userRepository.findAll(userFindByCriteria, pageable).map(userMapper::tUserDetailDTO);
		return page;
	}
	
}
