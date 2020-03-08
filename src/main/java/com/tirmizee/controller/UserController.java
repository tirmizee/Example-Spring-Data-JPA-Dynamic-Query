package com.tirmizee.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tirmizee.controller.data.UserDetailDTO;
import com.tirmizee.controller.data.UserDetailSearchDTO;

@RestController
@RequestMapping(path = "/users")
public class UserController extends ApiController {
	
	@GetMapping("/page")
	public Page<UserDetailDTO> paging(UserDetailSearchDTO search){
		System.out.println(search);
		return null;
	}
	
}
