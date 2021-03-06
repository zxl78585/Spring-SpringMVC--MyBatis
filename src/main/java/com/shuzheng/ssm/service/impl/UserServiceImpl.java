package com.shuzheng.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuzheng.ssm.mapper.UserMapper;
import com.shuzheng.ssm.model.User;
import com.shuzheng.ssm.service.IUserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getBooks(int id) {
		return userMapper.getBooks(id);
	}
	
}
