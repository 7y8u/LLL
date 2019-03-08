package com.fm.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fm.common.vo.SysResult;
import com.fm.manage.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/{id}")
	public SysResult test (@PathVariable Long id) {
		
		return SysResult.oK(userService.test(id));
	}
}
