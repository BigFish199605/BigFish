package com.snackcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snackcase.mapper.RegistMapper;
import com.snackcase.pojo.User;
@Service
public class RegistServiceImpl implements RegistService {
	@Autowired
	private RegistMapper registMapper;

	@Override
	public User findonebyUsername(String username) {
		return registMapper.findonebyname(username);
	}

	@Override
	public User findone(String email, String password) {
		return registMapper.findone(email, password);
	}

	@Override
	public void regist(User user) {
		registMapper.regist(user);
	}

}
