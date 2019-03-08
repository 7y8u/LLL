package com.fm.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fm.common.pojo.User;
import com.fm.manage.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public User test(Long id) {
		
		return userMapper.selectById(id);
	}

}
